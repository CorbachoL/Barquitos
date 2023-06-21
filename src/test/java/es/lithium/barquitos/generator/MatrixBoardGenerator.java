package es.lithium.barquitos.generator;

import es.lithium.barquitos.board.BoardInterface;
import es.lithium.barquitos.board.MatrixBoard;
import es.lithium.barquitos.board.model.BoardPosition;

public class MatrixBoardGenerator {

    public BoardInterface createEmptyBoard() {
        BoardInterface board = new MatrixBoard();

        return board;
    }

    public BoardInterface createOneBoatBoard() {
        BoardInterface board = new MatrixBoard();

        board.setBoat(new BoardPosition(0,0));
        board.setBoat(new BoardPosition(0,1));
        board.setBoat(new BoardPosition(0,2));
        board.setBoat(new BoardPosition(0,3));
        board.setBoat(new BoardPosition(0,4));

        return board;
    }

}
