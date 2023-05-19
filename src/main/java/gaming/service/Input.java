package gaming.service;

import gaming.view.Board;
import gaming.view.Game;
import gaming.view.Round;

/**
 * The Input class handles input and game logic in the Tic-Tac-Toe game.
 */
public class Input {
    /**
     * Checks if a cell is already occupied.
     * If the cell is occupied, it prompts the player to choose another cell and redo the move.
     * If the cell is not occupied, it makes the move on the board.
     * */
    public static void check(int row, int col) {
        if (isCellBusy(row, col)) {
            redoMove();
        } else {
            makeMove(row, col);
        }
    }

    /**
     * Checks if a cell is occupied on the game board.
     * Returns true if the cell is occupied by 'X' or 'O', indicating it is busy.
     * Returns false if the cell is empty.
     */
    public static boolean isCellBusy(int row, int col) {
        return Game.board[row - 1][col - 1] == 'X' || Game.board[row - 1][col - 1] == 'O';
    }

    /**
     * Redoes the previous move when the selected cell is already occupied.
     * If it's 'X' player's turn, it informs the user and prompts for a new move.
     * If it's 'O' player's turn, it informs the user and prompts for a new move.
     */
    public static void redoMove() {
        if (IsXNext.isXNext()) {
            if ("user".equals(Game.player1)) {
                System.out.println("This cell is occupied! Choose another one!");
            }
            Round.playerOne();
        } else {
            if ("user".equals(Game.player2)) {
                System.out.println("This cell is occupied! Choose another one!");
            }
            Round.playerTwo();
        }
    }

    /**
     * Makes the next move on the game board.
     * If it's 'X' player's turn, it calls the appropriate move method for 'X'.
     * If it's 'O' player's turn, it calls the appropriate move method for 'O'.
     */
    public static void makeMove(int row, int col) {
        if (IsXNext.isXNext()) {
            xMove(row, col);
        } else {
            oMove(row, col);
        }
    }

    /**
     * Implements the move for 'X' player.
     * Displays the level of difficulty and makes the move on the game board.
     * Displays the updated board and proceeds to the next round of the game.
     */
    public static void xMove(int row, int col) {
        switch (Game.player1) {
            case "easy" -> System.out.println("Making move level \"easy\"");
            case "medium" -> System.out.println("Making move level \"medium\"");
            case "hard" -> System.out.println("Making move level \"hard\"");
        }

        Game.board[row - 1][col - 1] = 'X';
        Game.numXMoves++;

        Board.display();
        Round.play();
    }

    /**
     * Implements the move for 'O' player.
     * Displays the level of difficulty and makes the move on the game board.
     * Displays the updated board and proceeds to the next round of the game.
     */
    public static void oMove(int row, int col) {
        switch (Game.player2) {
            case "easy" -> System.out.println("Making move level \"easy\"");
            case "medium" -> System.out.println("Making move level \"medium\"");
            case "hard" -> System.out.println("Making move level \"hard\"");
        }

        Game.board[row - 1][col - 1] = 'O';
        Game.numOMoves++;

        Board.display();
        Round.play();
    }

    /**
     * Resets the game by resetting the game board and the move counters.
     * Starts a new game round.
     */
    public static void resetGame() {
        Game.board = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        Game.numXMoves = 0;
        Game.numOMoves = 0;

        Game.play();
    }
}
