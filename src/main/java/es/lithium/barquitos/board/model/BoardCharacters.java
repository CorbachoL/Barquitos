package es.lithium.barquitos.board.model;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum BoardCharacters {

    UNKNOWN('~'),
    BOAT('¤'),
    WATER('_'),
    HIT('x');

    private char value;

    BoardCharacters(char value) {
        this.value = value;
    }

    public char print() {
        return value;
    }

    public static BoardCharacters from(char value) throws NoSuchElementException {

        return Arrays.stream(values())
                .filter(element -> element.value == value)
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }


}
