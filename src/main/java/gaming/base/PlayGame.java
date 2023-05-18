package gaming.base;

import java.util.Scanner;

public class PlayGame {
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
     * 1. Method displays the game options, parses the input command, and starts the game if the input is valid
     */
    public static void playGame() {
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
                DisplayBoard.displayBoard();
                PlayRound.playRound();
            } else {
                System.out.println("Bad parameters!");
                playGame();
            }
        } else {
            System.out.println("Bad parameters!");
            playGame();
        }
    }
}
