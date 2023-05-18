package gaming.base;

import gaming.mode.PlayUser;
import gaming.util.CheckInput;
import gaming.util.IsXNext;
import gaming.mode.PlayEasy;
import gaming.mode.PlayHard;
import gaming.mode.PlayMedium;

public class PlayRound {
    /**
     * 3. Method checks the state of the Tic-Tac-Toe game and returns the result (win, draw, or continue playing)
     */
    public static void playRound() {
        int row;
        int col;

        // Checking rows for X or O win
        for (row = 0; row < PlayGame.NUM_ROWS; row++) {
            if (checkHorizontal(row)) {
                System.out.println(PlayGame.board[row][0] == 'X' ? "X wins" : "O wins");
                System.out.println();
                CheckInput.resetGame();
                return;
            }
        }

        // Checking columns for X or O win
        for (col = 0; col < PlayGame.NUM_COLS; col++) {
            if (checkVertical(col)) {
                System.out.println(PlayGame.board[0][col] == 'X' ? "X wins" : "O wins");
                System.out.println();
                CheckInput.resetGame();
                return;
            }
        }

        // Checking diagonals for X or O win
        if (checkDiagonal()) {
            System.out.println(PlayGame.board[1][1] == 'X' ? "X wins" : "O wins");
            System.out.println();
            CheckInput.resetGame();
            return;
        }

        // Checking the draw game conditions
        if (checkDraw()) {
            System.out.println("Draw");
            System.out.println();
            CheckInput.resetGame();
        } else {
            if (IsXNext.isXNext()) {
                playerOne();
            } else {
                playerTwo();
            }
        }
    }

    /**
     * 4. Method checks for X or O win in the rows
     */
    public static boolean checkHorizontal(int row) {
        return PlayGame.board[row][0] == PlayGame.board[row][1]
                && PlayGame.board[row][1] == PlayGame.board[row][2]
                && PlayGame.board[row][0] != ' ';
    }

    /**
     * 5. Method checks for X or O win in the columns
     */
    public static boolean checkVertical(int column) {
        return PlayGame.board[0][column] == PlayGame.board[1][column]
                && PlayGame.board[1][column] == PlayGame.board[2][column]
                && PlayGame.board[0][column] != ' ';
    }

    /**
     * 6. Method checks for X or O win in the diagonals
     */
    public static boolean checkDiagonal() {
        return (PlayGame.board[0][0] == PlayGame.board[1][1]
                && PlayGame.board[1][1] == PlayGame.board[2][2]
                && PlayGame.board[1][1] != ' ')
                || (PlayGame.board[0][2] == PlayGame.board[1][1]
                && PlayGame.board[1][1] == PlayGame.board[2][0]
                && PlayGame.board[1][1] != ' ');
    }

    /**
     * 7. Method checks for draw conditions
     */
    public static boolean checkDraw() {
        boolean isDraw = true;
        for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
            for (int column = 0; column < PlayGame.NUM_COLS; column++) {
                if (PlayGame.board[row][column] == ' ') {
                    isDraw = false;
                    break;
                }
            }
        }
        return isDraw;
    }

    /**
     * 8. Method returns player1.
     */
    public static void playerOne() {
        switch (PlayGame.player1) {
            case "user" -> PlayUser.playUser();
            case "easy" -> PlayEasy.playEasy();
            case "medium" -> PlayMedium.playMedium();
            case "hard" -> PlayHard.playHard();
        }
    }

    /**
     * 9. Method returns player2
     */
    public static void playerTwo() {
        switch (PlayGame.player2) {
            case "user" -> PlayUser.playUser();
            case "easy" -> PlayEasy.playEasy();
            case "medium" -> PlayMedium.playMedium();
            case "hard" -> PlayHard.playHard();
        }
    }
}
