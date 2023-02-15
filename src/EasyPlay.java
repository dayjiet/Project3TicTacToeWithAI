import java.util.Random;

public class EasyPlay {
    static Random randomGenerator = new Random();
    /**
     * 12. Method implements computer's move with easy level
     * */
    public static void easyPlay() {
        int row, col;

        row = randomGenerator.nextInt(PlayGame.NUM_ROWS) + 1;
        col = randomGenerator.nextInt(PlayGame.NUM_COLS) + 1;

        CheckInput.checkInput(row, col);
    }
}
