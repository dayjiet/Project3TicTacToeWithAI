package gaming.dao;

import gaming.service.Input;
import gaming.view.Game;

import java.util.Random;

/**
 * The Easy class represents a computer player with easy level in the Tic-Tac-Toe game.
 * It implements the computer's move by choosing a random empty cell on the board.
 */
public class Easy {
    static Random randomGenerator = new Random();

    /**
     * Implements the computer's move with easy level in the game.
     * It randomly selects an empty cell on the board and makes a move.
     */
    public static void play() {
        int row, col;

        row = randomGenerator.nextInt(Game.NUM_ROWS) + 1;
        col = randomGenerator.nextInt(Game.NUM_COLS) + 1;

        Input.check(row, col);
    }
}
