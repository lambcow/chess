package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {

    private int row;
    private int col;

    public ChessPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        /**
         * The input is upsidedown from how the arrays are arranged.
         * In order to properly send back the data, you can subtract 8 from the input
         * since it compliments 8, then multiply by -1 to give the correct positive row
         * that corresponds to where the in the array it actually should be.
          */
        return ((row-8)*(-1));
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        /**
         * The input is one more than the array since the array is 0-indexed,
         * so the input is returned with one subtracted off to give the array location.
         */
        return col-1;
    }
}
