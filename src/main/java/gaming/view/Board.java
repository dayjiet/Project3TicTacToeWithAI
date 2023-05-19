package gaming.view;

/**
 * The Board class represents the game board in the Tic-Tac-Toe game.
 * It is responsible for displaying the current state of the board.
 */
public class Board {
    final static int NUM_ROWS = 3, NUM_COLS = 3;

    /**
     * Displays the current state of the game board, including X and O moves count.
     * The board is printed with the moves made by the players.
     * X represents player 1's moves and O represents player 2's moves.
     * The board is displayed in a grid format.
     */
    public static void display() {
        System.out.println("---------");
        for (int row = 0; row < NUM_ROWS; row++) {
            System.out.print("| ");
            for (int col = 0; col < NUM_COLS; col++) {
                System.out.print(Game.board[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
