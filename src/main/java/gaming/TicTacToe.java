package gaming;

import gaming.view.Game;

/**
 * The TicTacToe class represents a simple Tic-Tac-Toe game.
 * It provides the main method to start the game and interact with the players.
 * The game is played on a 3x3 board.
 */
public class TicTacToe {
    /**
     * The main method of the TicTacToe class.
     * It starts the game by calling the play method of the Game class.
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Game.play();
    }
}