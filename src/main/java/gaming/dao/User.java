package gaming.dao;

import gaming.view.Game;
import gaming.service.Input;

/**
 * The User class represents a user player in the Tic-Tac-Toe game.
 * It implements the user's move by accepting input coordinates from the user.
 */
public class User {

    /**
     * Implements the user's move in the game.
     * It prompts the user to enter the coordinates.
     * The input coordinates are validated and processed.
     * If the coordinates are invalid, the user is prompted to enter valid coordinates.
     */
    public static void play() {
        System.out.print("Enter the coordinates: > ");

        String inputCoordinates = Game.inputScanner.nextLine();
        String[] inputCoordinatesArray = inputCoordinates.split(" ");

        if (inputCoordinatesArray.length == 2) {
            try {
                int row = Integer.parseInt(inputCoordinatesArray[0]);
                int col = Integer.parseInt(inputCoordinatesArray[1]);

                if (row < 1 || row > 3 || col < 1 || col > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    play();
                } else {
                    Input.check(row, col);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("You should enter numbers!");
                play();
            }
        } else {
            System.out.println("You should enter numbers!");
            play();
        }
    }
}
