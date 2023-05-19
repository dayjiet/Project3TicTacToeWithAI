package gaming.view;

import gaming.dao.User;
import gaming.service.Input;
import gaming.service.IsXNext;
import gaming.dao.Easy;
import gaming.dao.Hard;
import gaming.dao.Medium;

/**
 * The Round class handles the game logic for each round of Tic-Tac-Toe.
 * It checks the state of the game, including win, draw, or continuing to the next round.
 */
public class Round {

    /**
     * Checks the state of the Tic-Tac-Toe game and returns the result (win, draw, or continue playing).
     * It checks for win conditions in rows, columns, and diagonals.
     * If a win condition is found, it displays the winner and resets the game.
     * If the game is a draw, it displays "Draw" and resets the game.
     * Otherwise, it determines which player should play next and proceeds accordingly.
     */
    public static void play() {
        int row;
        int col;

        for (row = 0; row < Game.NUM_ROWS; row++) {
            if (checkHorizontal(row)) {
                System.out.println(Game.board[row][0] == 'X' ? "X wins" : "O wins");
                System.out.println();
                Input.resetGame();
                return;
            }
        }

        for (col = 0; col < Game.NUM_COLS; col++) {
            if (checkVertical(col)) {
                System.out.println(Game.board[0][col] == 'X' ? "X wins" : "O wins");
                System.out.println();
                Input.resetGame();
                return;
            }
        }

        if (checkDiagonal()) {
            System.out.println(Game.board[1][1] == 'X' ? "X wins" : "O wins");
            System.out.println();
            Input.resetGame();
            return;
        }

        if (checkDraw()) {
            System.out.println("Draw");
            System.out.println();
            Input.resetGame();
        } else {
            if (IsXNext.isXNext()) {
                playerOne();
            } else {
                playerTwo();
            }
        }
    }

    /**
     * Checks for X or O win in the rows.
     * @param row The row to check for a win.
     * @return true if there is a win in the specified row, false otherwise.
     */
    public static boolean checkHorizontal(int row) {
        return Game.board[row][0] == Game.board[row][1]
                && Game.board[row][1] == Game.board[row][2]
                && Game.board[row][0] != ' ';
    }

    /**
     * Checks for X or O win in the columns.
     * @param column The column to check for a win.
     * @return true if there is a win in the specified column, false otherwise.
     */
    public static boolean checkVertical(int column) {
        return Game.board[0][column] == Game.board[1][column]
                && Game.board[1][column] == Game.board[2][column]
                && Game.board[0][column] != ' ';
    }

    /**
     * Checks for X or O win in the diagonals.
     * @return true if there is a win in any diagonal, false otherwise.
     */
    public static boolean checkDiagonal() {
        return (Game.board[0][0] == Game.board[1][1]
                && Game.board[1][1] == Game.board[2][2]
                && Game.board[1][1] != ' ')
                || (Game.board[0][2] == Game.board[1][1]
                && Game.board[1][1] == Game.board[2][0]
                && Game.board[1][1] != ' ');
    }

    /**
     * Checks for draw conditions in the game.
     * @return true if the game is a draw, false otherwise.
     */
    public static boolean checkDraw() {
        boolean isDraw = true;
        for (int row = 0; row < Game.NUM_ROWS; row++) {
            for (int column = 0; column < Game.NUM_COLS; column++) {
                if (Game.board[row][column] == ' ') {
                    isDraw = false;
                    break;
                }
            }
        }
        return isDraw;
    }

    /**
     * Plays the turn for player1 based on the selected player type (user, easy, medium, hard).
     * The appropriate method from the corresponding player class is called.
     */
    public static void playerOne() {
        switch (Game.player1) {
            case "user" -> User.play();
            case "easy" -> Easy.play();
            case "medium" -> Medium.play();
            case "hard" -> Hard.play();
        }
    }

    /**
     * Plays the turn for player2 based on the selected player type (user, easy, medium, hard).
     * The appropriate method from the corresponding player class is called.
     */
    public static void playerTwo() {
        switch (Game.player2) {
            case "user" -> User.play();
            case "easy" -> Easy.play();
            case "medium" -> Medium.play();
            case "hard" -> Hard.play();
        }
    }
}
