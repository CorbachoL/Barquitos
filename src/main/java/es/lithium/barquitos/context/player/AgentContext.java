package es.lithium.barquitos.context.player;

import es.lithium.barquitos.board.BoardInterface;
import es.lithium.barquitos.board.model.BoardCharacters;
import es.lithium.barquitos.board.model.BoardPosition;
import es.lithium.barquitos.board.model.PositionShot;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Getter
public class AgentContext {

    private String name;
    private List<PositionShot> shotHistory;
    private BoardInterface playerBoard;
    private BoardInterface enemyBoard;

    public AgentContext(@NonNull String name, @NonNull BoardInterface playerBoard, @NonNull BoardInterface enemyBoard) {
        this.name = name;
        this.playerBoard = playerBoard;
        this.enemyBoard = enemyBoard;
        this.shotHistory = new ArrayList<>();
    }

    /**
     * The method saves the shot in the history
     * @param position of the shot
     * @param result of the shot
     */
    public void addShot(BoardPosition position, BoardCharacters result) {
        shotHistory.add(new PositionShot(position, result));
    }

}
