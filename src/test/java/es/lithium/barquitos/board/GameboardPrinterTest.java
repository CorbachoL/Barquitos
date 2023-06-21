package es.lithium.barquitos.board;

import es.lithium.barquitos.board.model.BoardPosition;
import es.lithium.barquitos.generator.MatrixBoardGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameboardPrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private GameboardPrinter printer = new GameboardPrinter();
    MatrixBoardGenerator generator = new MatrixBoardGenerator();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void givenEmptyBoard_whenPrint_thenOK() {

        BoardInterface board = generator.createEmptyBoard();

        printer.print(board);

        assertEquals(getStringConsoleBoard(board), outContent.toString());
    }

    @Test
    public void givenOneBoatBoard_whenPrint_thenOK() {

        BoardInterface board = generator.createOneBoatBoard();

        printer.print(board);

        assertEquals(getStringConsoleBoard(board), outContent.toString());
    }

    private String getStringConsoleBoard(BoardInterface board) {

        StringBuilder builder = new StringBuilder();

        IntStream.range(0, board.getNumberColumns()).forEach(col -> {

            IntStream.range(0, board.getNumberRows()).forEach( row -> {

                builder.append(board.getBox(new BoardPosition(row, col)).print()).append("  ");
            });
            builder.append("\n");
        });
        builder.substring(0, builder.length() - 2);

        return builder.toString();
    }
}