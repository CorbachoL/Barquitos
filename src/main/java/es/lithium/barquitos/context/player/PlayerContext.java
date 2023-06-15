package es.lithium.barquitos.context.player;

import es.lithium.barquitos.board.BoardInterface;
import es.lithium.barquitos.board.MatrixBoard;
import es.lithium.barquitos.constant.PositionShot;

import java.util.List;

public class PlayerContext {

    private String name;
    private List<PositionShot> shotHistory;
    private BoardInterface playerBoard;
    private BoardInterface enemyBoard;

}
