public class DisplayBoard {
    final static int NUM_ROWS = 3, NUM_COLS = 3;

    /**
     * 2. Method displays the current state of the game board, including X and O moves count
     */
    public static void displayBoard() {
        System.out.println("---------");
        for (int row = 0; row < NUM_ROWS; row++) {
            System.out.print("| ");
            for (int col = 0; col < NUM_COLS; col++) {
                System.out.print(PlayGame.board[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
