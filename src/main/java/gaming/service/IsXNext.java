package gaming.service;

import gaming.view.Game;

/**
 * The IsXNext class determines the next move to be played by 'X' in the Tic-Tac-Toe game.
 */
public class IsXNext {
    /**
     * Checks if it is 'X' player's turn to move.
     * Returns true if the number of 'X' moves is less than or equal to the number of 'O' moves, indicating its
     * 'X' player's turn.
     * Returns false otherwise.
     */
    public static boolean isXNext() {
        return Game.numXMoves <= Game.numOMoves;
    }
}
