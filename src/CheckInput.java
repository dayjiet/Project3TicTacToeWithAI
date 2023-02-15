public class CheckInput {
    /**
     * 18. Method checks if the cell is already occupied
     */
    public static void checkInput(int row, int col) {
        if (cellIsBusy(row, col)) {
            redoMove();
        } else {
            makeMove(row, col);
        }
    }

    /**
     * 19. Method that checks if the cell is occupied
     */
    public static boolean cellIsBusy(int row, int col) {
        return PlayGame.board[row - 1][col - 1] == 'X' || PlayGame.board[row - 1][col - 1] == 'O';
    }

    /**
     * 20. Method redoes the previous move
     */
    public static void redoMove() {
        if (IsXNext.isXNext()) {
            if ("user".equals(PlayGame.player1)) {
                System.out.println("This cell is occupied! Choose another one!");
            }
            PlayRound.playerOne();
        } else {
            if ("user".equals(PlayGame.player2)) {
                System.out.println("This cell is occupied! Choose another one!");
            }
            PlayRound.playerTwo();
        }
    }

    /**
     * 21. Method implements the next move
     */
    public static void makeMove(int row, int col) {
        if (IsXNext.isXNext()) {
            xMove(row, col);
        } else {
            oMove(row, col);
        }
    }

    /**
     * 22. Method implements X's move
     */
    public static void xMove(int row, int col) {
        switch (PlayGame.player1) {
            case "easy" -> System.out.println("Making move level \"easy\"");
            case "medium" -> System.out.println("Making move level \"medium\"");
            case "hard" -> System.out.println("Making move level \"hard\"");
        }

        PlayGame.board[row - 1][col - 1] = 'X';
        PlayGame.numXMoves++;

        DisplayBoard.displayBoard();
        PlayRound.playRound();
    }

    /**
     * 23. Method implements O's move
     */
    public static void oMove(int row, int col) {
        switch (PlayGame.player2) {
            case "easy" -> System.out.println("Making move level \"easy\"");
            case "medium" -> System.out.println("Making move level \"medium\"");
            case "hard" -> System.out.println("Making move level \"hard\"");
        }

        PlayGame.board[row - 1][col - 1] = 'O';
        PlayGame.numOMoves++;

        DisplayBoard.displayBoard();
        PlayRound.playRound();
    }

    /**
     * 24. Method resets the game
     */
    public static void resetGame() {
        PlayGame.board = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        PlayGame.numXMoves = 0;
        PlayGame.numOMoves = 0;

        PlayGame.playGame();
    }
}
