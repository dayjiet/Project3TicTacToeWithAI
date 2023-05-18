package gaming.mode;

import gaming.util.CheckInput;
import gaming.util.IsXNext;
import gaming.base.PlayGame;
import gaming.base.PlayRound;

public class PlayMedium {
    /**
     * 13. Method implements computer's move with medium level
     */
    public static void playMedium() {
        if (IsXNext.isXNext()) {
            if (checkMove('X')) {
                return;
            }

            if (checkMove('O')) {
                return;
            }

            PlayEasy.playEasy();
        } else {
            if (checkMove('O')) {
                return;
            }

            if (checkMove('X')) {
                return;
            }

            PlayEasy.playEasy();
        }
    }

    /**
     * 14. Method checks the empty cells on the board
     */
    public static boolean checkMove(char mark) {
        for (int row = 0; row < PlayGame.NUM_ROWS; row++) {
            for (int col = 0; col < PlayGame.NUM_COLS; col++) {
                if (PlayGame.board[row][col] == ' ') {
                    PlayGame.board[row][col] = mark;

                    if (PlayRound.checkHorizontal(row) || PlayRound.checkVertical(col) || PlayRound.checkDiagonal()
                            || PlayRound.checkDraw()) {
                        PlayGame.board[row][col] = ' ';
                        CheckInput.checkInput(row + 1, col + 1);
                        return true;
                    } else {
                        PlayGame.board[row][col] = ' ';
                    }
                }
            }
        }
        return false;
    }
}
