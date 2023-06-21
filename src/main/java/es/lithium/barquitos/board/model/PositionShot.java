package es.lithium.barquitos.board.model;

import java.util.Objects;

/**
 * @author javi
 * @apiNote Immutable object
 */
public class PositionShot {

    private BoardPosition position;
    private BoardCharacters result;


    public static PositionShot fromHit(BoardPosition position) {
        return new PositionShot(position, BoardCharacters.HIT);
    }

    public static PositionShot fromWater(BoardPosition position) {
        return new PositionShot(position, BoardCharacters.WATER);
    }

    public PositionShot(BoardPosition position, BoardCharacters result) {

        Objects.requireNonNull(position, "Position can't be null");
        Objects.requireNonNull(result, "Result can't be null");

        this.position = position;
        this.result = result;
    }

    public BoardPosition getPosition() {
        return position;
    }

    public BoardCharacters getResult() {
        return result;
    }

}
