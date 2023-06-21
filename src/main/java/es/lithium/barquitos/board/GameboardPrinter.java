package es.lithium.barquitos.board;

import es.lithium.barquitos.board.model.BoardPosition;

import java.util.stream.IntStream;

public class GameboardPrinter {

    public void print(BoardInterface board) {

        StringBuilder builder = new StringBuilder();

        IntStream.range(0, board.getNumberColumns()).forEach(col -> {

            IntStream.range(0, board.getNumberRows()).forEach( row -> {

                builder.append(board.getBox(new BoardPosition(row, col)).print()).append("  ");
            });
            builder.append("\n");
        });
        builder.substring(0, builder.length() - 2);

        System.out.print(builder.toString());
    }


}
