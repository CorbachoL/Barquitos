package es.lithium.barquitos.board;

import es.lithium.barquitos.board.model.BoardCharacters;
import es.lithium.barquitos.board.model.BoardPosition;

import java.util.Objects;
import java.util.stream.IntStream;

public class MatrixBoard implements BoardInterface {

    private static final int DEFAULT_ROW_NUMBER = 10;
    private static final int DEFAULT_COL_NUMBER = 10;

    private char[][] board;
    private int rowsNumber;
    private int colsNumber;

    public MatrixBoard() {
        this(DEFAULT_ROW_NUMBER, DEFAULT_COL_NUMBER);
    }

    public MatrixBoard(int rowsNumber, int columnsNumber) {

        if(rowsNumber <= 0)
            throw new IndexOutOfBoundsException("RowsNumber must be greater than 0");
        if(columnsNumber <= 0)
            throw new IndexOutOfBoundsException("ColsNumber must be greater than 0");

        this.rowsNumber = rowsNumber;
        this.colsNumber = columnsNumber;

        this.board = new char[this.rowsNumber][this.colsNumber];
        IntStream.range(0, this.colsNumber).forEach(col -> {
            IntStream.range(0, this.rowsNumber).forEach( row -> {
                this.board[row][col] = BoardCharacters.UNKNOWN.print();
            });
        });
    }

    @Override
    public int getNumberRows() {
        return this.rowsNumber;
    }

    @Override
    public int getNumberColumns() {
        return this.colsNumber;
    }

    @Override
    public void setBoat(BoardPosition position) throws IndexOutOfBoundsException {

        validatePosition(position);
        this.board[position.getRow()][position.getCol()] = BoardCharacters.BOAT.print();
    }

    @Override
    public boolean isHit(BoardPosition position) {

        validatePosition(position);
        return BoardCharacters.BOAT.print() == this.board[position.getRow()][position.getCol()];
    }

    @Override
    public BoardCharacters getBox(BoardPosition position) {

        validatePosition(position);
        return BoardCharacters.from( this.board[position.getRow()][position.getCol()] );
    }

    private void validatePosition(BoardPosition position) {

        Objects.requireNonNull(position, "Can't process a null position");

        if(this.rowsNumber <= position.getRow())
            throw new IndexOutOfBoundsException(String.format("Position out of the board: Max row value %d. Actual value %d", this.rowsNumber, position.getRow()));

        if(this.colsNumber <= position.getCol())
            throw new IndexOutOfBoundsException(String.format("Position out of the board: Max col value %d. Actual value %d", this.colsNumber, position.getCol()));
    }
}
