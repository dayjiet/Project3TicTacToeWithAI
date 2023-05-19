package gaming.view;

import java.util.Scanner;

/**
 * The Game class represents the game logic and player interactions in the Tic-Tac-Toe game.
 * It handles the input commands, validates them, and starts the game.
 */
public class Game {
    public static Scanner inputScanner = new Scanner(System.in);
    static String currentGameMode;
    public static String player1;
    public static String player2;
    public static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    public static final int NUM_ROWS = 3, NUM_COLS = 3;
    public static int numXMoves = 0;
    public static int numOMoves = 0;

    /**
     * Displays the game options, parses the input command, and starts the game if the input is valid.
     * The input command should be in the format "start [player1] [player2]".
     * Valid player options are "user", "easy", "medium", and "hard".
     * If the input command is not valid, the user is prompted to enter a valid command.
     */
    public static void play() {
        System.out.print("Input command: > ");

        String cmd = inputScanner.nextLine();

        if ("exit".equals(cmd)) {
            return;
        }

        String[] cmdArr = cmd.split(" ");

        if ("start".equals(cmdArr[0]) && cmdArr.length == 3) {
            currentGameMode = cmdArr[0];
            player1 = cmdArr[1];
            player2 = cmdArr[2];

            boolean userVsUser = ("user".equals(player1) && "user".equals(player2));

            boolean userVsComp = ("user".equals(player1)
                    && ("easy".equals(player2) || "medium".equals(player2) || "hard".equals(player2)));

            boolean compVsUser = ("user".equals(player2)
                    && ("easy".equals(player1) || "medium".equals(player1) || "hard".equals(player1)));

            boolean compVsComp = (("easy".equals(player1) || "medium".equals(player1) || "hard".equals(player1))
                    && ("easy".equals(player2) || "medium".equals(player2) || "hard".equals(player2)));

            if (userVsUser || userVsComp || compVsUser || compVsComp) {
                Board.display();
                Round.play();
            } else {
                System.out.println("Bad parameters!");
                play();
            }
        } else {
            System.out.println("Bad parameters!");
            play();
        }
    }
}
