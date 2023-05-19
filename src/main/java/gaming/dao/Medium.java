package gaming.dao;

import gaming.service.Input;
import gaming.service.IsXNext;
import gaming.view.Game;
import gaming.view.Round;

/**
 * The Medium class represents a computer player with medium level in the Tic-Tac-Toe game.
 * It implements the computer's move by analyzing the board and making strategic decisions.
 */
public class Medium {
    /**
     * Implements the computer's move with medium level in the game.
     * It analyzes the board and makes strategic moves based on the current game state.
     * The computer prioritizes winning moves, blocking opponent's winning moves, and random moves as the last resort.
     */
    public static void play() {
        if (IsXNext.isXNext()) {
            if (checkMove('X')) {
                return;
            }

            if (checkMove('O')) {
                return;
            }

            Easy.play();
        } else {
            if (checkMove('O')) {
                return;
            }

            if (checkMove('X')) {
                return;
            }

            Easy.play();
        }
    }

    /**
     * Checks for possible moves on the board for a given mark.
     * It checks empty cells on the board and determines if making a move with the given mark would result in a win or draw.
     * If a winning or drawing move is found, the move is made on the board.
     * Returns true if a winning or drawing move is found, false otherwise.
     */
    public static boolean checkMove(char mark) {
        for (int row = 0; row < Game.NUM_ROWS; row++) {
            for (int col = 0; col < Game.NUM_COLS; col++) {
                if (Game.board[row][col] == ' ') {
                    Game.board[row][col] = mark;

                    if (Round.checkHorizontal(row) || Round.checkVertical(col) || Round.checkDiagonal()
                            || Round.checkDraw()) {
                        Game.board[row][col] = ' ';
                        Input.check(row + 1, col + 1);
                        return true;
                    } else {
                        Game.board[row][col] = ' ';
                    }
                }
            }
        }
        return false;
    }
}
