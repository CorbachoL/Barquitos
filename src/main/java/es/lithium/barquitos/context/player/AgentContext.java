package es.lithium.barquitos.context.player;

import es.lithium.barquitos.board.BoardInterface;
import es.lithium.barquitos.board.model.PositionShot;

import java.util.List;

public class AgentContext {

    private String name;
    private List<PositionShot> shotHistory;
    private BoardInterface playerBoard;
    private BoardInterface enemyBoard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PositionShot> getShotHistory() {
        return shotHistory;
    }

    public void setShotHistory(List<PositionShot> shotHistory) {
        this.shotHistory = shotHistory;
    }

    public BoardInterface getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(BoardInterface playerBoard) {
        this.playerBoard = playerBoard;
    }

    public BoardInterface getEnemyBoard() {
        return enemyBoard;
    }

    public void setEnemyBoard(BoardInterface enemyBoard) {
        this.enemyBoard = enemyBoard;
    }
}
