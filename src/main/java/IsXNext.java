public class IsXNext {
    /**
     * 10. Method checks for next move to be played by 'X'
     */
    public static boolean isXNext() {
        return PlayGame.numXMoves <= PlayGame.numOMoves;
    }
}
