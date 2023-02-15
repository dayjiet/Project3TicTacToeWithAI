public class XNext {
    /**
     * 10. Method checks for next move to be played by 'X'
     * */
    public static boolean xNext() {
        return PlayGame.numXMoves <= PlayGame.numOMoves;
    }
}
