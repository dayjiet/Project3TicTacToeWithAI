package gaming.mode;

import gaming.util.CheckInput;
import gaming.util.IsXNext;
import gaming.base.PlayGame;
import gaming.base.PlayRound;

public class PlayHard {
    /**
     * 15. Method implements computer's move with hard level
     */
    public static void playHard() {
        int bestRow = -1, bestCol = -1;

        int bestScore;
        if (IsXNext.isXNext()) {
            bestScore = Integer.MIN_VALUE;
            for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
                for (int col = 0; col < PlayGame.NUM_COLS; col++) {
                    if (PlayGame.board[row][col] == ' ') {
                        PlayGame.board[row][col] = 'X';

                        int score = minimax(0, false);

                        PlayGame.board[row][col] = ' ';

                        if (score > bestScore) {
                            bestScore = score;
                            bestRow = row;
                            bestCol = col;
                        }
                    }
                }
            }
        } else {
            bestScore = Integer.MAX_VALUE;
            for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
                for (int col = 0; col < PlayGame.NUM_COLS; col++) {
                    if (PlayGame.board[row][col] == ' ') {
                        PlayGame.board[row][col] = 'O';

                        int score = minimax(0, true);

                        PlayGame.board[row][col] = ' ';

                        if (score < bestScore) {
                            bestScore = score;
                            bestRow = row;
                            bestCol = col;
                        }
                    }
                }
            }
        }
        CheckInput.checkInput(bestRow + 1, bestCol + 1);
    }

    /**
     * 16. Method Calculates the best move for the computer player using the minimax algorithm
     */
    public static int minimax(int depth, boolean isMaximizing) {
        int score = evaluate();

        if (score == 10) {
            return 10 - depth;
        }

        if (score == -10) {
            return depth - 10;
        }

        if (PlayRound.checkDraw() || depth == 9) {
            return 0;
        }

        int bestScore;
        if (isMaximizing) {
            bestScore = Integer.MIN_VALUE;
            for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
                for (int col = 0; col < PlayGame.NUM_COLS; col++) {
                    if (PlayGame.board[row][col] == ' ') {
                        PlayGame.board[row][col] = 'X';

                        score = minimax(depth + 1, false);

                        PlayGame.board[row][col] = ' ';

                        if (score > bestScore) {
                            bestScore = score;
                        }
                    }
                }
            }
        } else {
            bestScore = Integer.MAX_VALUE;
            for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
                for (int col = 0; col < PlayGame.NUM_COLS; col++) {
                    if (PlayGame.board[row][col] == ' ') {
                        PlayGame.board[row][col] = 'O';

                        score = minimax(depth + 1, true);

                        PlayGame.board[row][col] = ' ';

                        if (score < bestScore) {
                            bestScore = score;
                        }
                    }
                }
            }
        }
        return bestScore;
    }

    /**
     * 17. Method evaluates the current state of the tic-tac-toe game and returns a score for the current player
     */
    public static int evaluate() {
        for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
            if (PlayRound.checkHorizontal(row)) {
                return PlayGame.board[row][0] == 'X' ? 10 : -10;
            }
        }

        for (int col = 0; col < PlayGame.NUM_COLS; col++) {
            if (PlayRound.checkVertical(col)) {
                return PlayGame.board[0][col] == 'X' ? 10 : -10;
            }
        }

        if (PlayRound.checkDiagonal()) {
            return PlayGame.board[1][1] == 'X' ? 10 : -10;
        }

        return 0;
    }
}
