package es.lithium.barquitos.board.model;

/**
 * @author javi
 * @apiNote Immutable object
 */
public class BoardPosition {

    private int row;
    private int col;

    /**
     *
     * @param row int value of the row position in a board
     * @param col int value of the column position in a board
     * @throws IndexOutOfBoundsException if row or col are lower than 0
     */
    public BoardPosition(int row, int col) throws IndexOutOfBoundsException {

        if(row < 0)
            throw new IndexOutOfBoundsException("Row must be greater or equal than 0");
        if(col < 0)
            throw new IndexOutOfBoundsException("Col must be greater or equal than 0");

        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
