package gaming.dao;

import gaming.service.Input;
import gaming.service.IsXNext;
import gaming.view.Game;
import gaming.view.Round;

/**
 * The Hard class represents a computer player with hard level in the Tic-Tac-Toe game.
 * It implements the computer's move using the minimax algorithm for optimal decision making.
 */
public class Hard {

    /**
     * Implements the computer's move with hard level in the game.
     * It uses the minimax algorithm to evaluate the best move for the computer player.
     * The computer player analyzes all possible moves and chooses the move that leads to the best outcome.
     */
    public static void play() {
        int bestRow = -1, bestCol = -1;

        int bestScore;
        if (IsXNext.isXNext()) {
            bestScore = Integer.MIN_VALUE;
            for (int row = 0; row < Game.NUM_ROWS; row++) {
                for (int col = 0; col < Game.NUM_COLS; col++) {
                    if (Game.board[row][col] == ' ') {
                        Game.board[row][col] = 'X';

                        int score = minimax(0, false);

                        Game.board[row][col] = ' ';

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
            for (int row = 0; row < Game.NUM_ROWS; row++) {
                for (int col = 0; col < Game.NUM_COLS; col++) {
                    if (Game.board[row][col] == ' ') {
                        Game.board[row][col] = 'O';

                        int score = minimax(0, true);

                        Game.board[row][col] = ' ';

                        if (score < bestScore) {
                            bestScore = score;
                            bestRow = row;
                            bestCol = col;
                        }
                    }
                }
            }
        }
        Input.check(bestRow + 1, bestCol + 1);
    }

    /**
     * Calculates the best move for the computer player using the minimax algorithm.
     * It evaluates the game state and assigns scores to different outcomes.
     * The algorithm recursively explores all possible moves and selects the move with the highest score (for the maximizing player) or lowest score (for the minimizing player).
     * Returns the score of the best move.
     */
    public static int minimax(int depth, boolean isMaximizing) {
        int score = evaluate();

        if (score == 10) {
            return 10 - depth;
        }

        if (score == -10) {
            return depth - 10;
        }

        if (Round.checkDraw() || depth == 9) {
            return 0;
        }

        int bestScore;
        if (isMaximizing) {
            bestScore = Integer.MIN_VALUE;
            for (int row = 0; row < Game.NUM_ROWS; row++) {
                for (int col = 0; col < Game.NUM_COLS; col++) {
                    if (Game.board[row][col] == ' ') {
                        Game.board[row][col] = 'X';

                        score = minimax(depth + 1, false);

                        Game.board[row][col] = ' ';

                        if (score > bestScore) {
                            bestScore = score;
                        }
                    }
                }
            }
        } else {
            bestScore = Integer.MAX_VALUE;
            for (int row = 0; row < Game.NUM_ROWS; row++) {
                for (int col = 0; col < Game.NUM_COLS; col++) {
                    if (Game.board[row][col] == ' ') {
                        Game.board[row][col] = 'O';

                        score = minimax(depth + 1, true);

                        Game.board[row][col] = ' ';

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
     * Evaluates the current state of the tic-tac-toe game and returns a score for the current player.
     * It checks for winning conditions in rows, columns, and diagonals.
     * Returns 10 if the current player wins, -10 if the opponent wins, or 0 if it's a draw.
     */
    public static int evaluate() {
        for (int row = 0; row < Game.NUM_ROWS; row++) {
            if (Round.checkHorizontal(row)) {
                return Game.board[row][0] == 'X' ? 10 : -10;
            }
        }

        for (int col = 0; col < Game.NUM_COLS; col++) {
            if (Round.checkVertical(col)) {
                return Game.board[0][col] == 'X' ? 10 : -10;
            }
        }

        if (Round.checkDiagonal()) {
            return Game.board[1][1] == 'X' ? 10 : -10;
        }

        return 0;
    }
}
