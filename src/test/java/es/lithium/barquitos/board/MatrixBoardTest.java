package es.lithium.barquitos.board;

import es.lithium.barquitos.board.model.BoardPosition;
import es.lithium.barquitos.generator.MatrixBoardGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixBoardTest {

    BoardInterface board;
    MatrixBoardGenerator generator = new MatrixBoardGenerator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        //printer.print(board);
    }

    @Test
    public void givenEmptyBoard_whenHit_thenFalse() {

        // given
        board = generator.createOneBoatBoard();

        // when
        BoardPosition position = new BoardPosition(2,2);

        // then
        assertFalse(board.isHit(position));
    }

    @Test
    public void givenNewBoard_whenHit_thenFalse() {

        // given
        board = generator.createOneBoatBoard();

        // when
        BoardPosition position = new BoardPosition(2,2);

        // then
        assertFalse(board.isHit(position));
    }

    @Test
    public void givenNewBoard_whenHit_thenTrue() {

        // given
        board = generator.createOneBoatBoard();

        // when
        BoardPosition position = new BoardPosition(0,1);

        // then
        assertTrue(board.isHit(position));
    }

    @Test
    public void givenNewBoard_whenAccessOutOfBoard_throwsException() {

        // given
        board = generator.createOneBoatBoard();

        // When
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> board.isHit(new BoardPosition(board.getNumberRows(), board.getNumberColumns())),
                "Se esperaba IndexOutOfBoundsException al llamar fuera del board");
    }

    @Test
    public void givenNewBoard_whenAccessWithNullPosition_throwsException() {

        // given
        board = generator.createOneBoatBoard();

        // When
        assertThrows(
                NullPointerException.class,
                () -> board.isHit(null),
                "Se esperaba NullPointerException al llamar con un Position nulo");
    }


}