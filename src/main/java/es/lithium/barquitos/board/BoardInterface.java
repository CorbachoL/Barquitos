package es.lithium.barquitos.board;

import es.lithium.barquitos.board.model.BoardCharacters;
import es.lithium.barquitos.board.model.BoardPosition;

public interface BoardInterface {

    public int getNumberRows();
    public int getNumberColumns();

    public void setBoat(BoardPosition position);
    public BoardCharacters getBox(BoardPosition position);
    public boolean isHit(BoardPosition position);

}
