package gaming.mode;

import gaming.base.PlayGame;
import gaming.util.CheckInput;

public class PlayUser {
    /**
     * 11. Method implements user's move
     */
    public static void playUser() {
        System.out.print("Enter the coordinates: > ");

        String inputCoordinates = PlayGame.inputScanner.nextLine();
        String[] inputCoordinatesArray = inputCoordinates.split(" ");

        if (inputCoordinatesArray.length == 2) {
            try {
                int row = Integer.parseInt(inputCoordinatesArray[0]);
                int col = Integer.parseInt(inputCoordinatesArray[1]);

                if (row < 1 || row > 3 || col < 1 || col > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    playUser();
                } else {
                    CheckInput.checkInput(row, col);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("You should enter numbers!");
                playUser();
            }
        } else {
            System.out.println("You should enter numbers!");
            playUser();
        }
    }
}
