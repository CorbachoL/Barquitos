package es.lithium.barquitos.constant;

import java.util.Arrays;

public enum Difficulty {

    EASY, NORMAL, COMPLEX;

    public static Difficulty from(String value) {

        return Arrays.stream(values())
                .filter(element -> element.name().equals(value))
                .findAny()
                .orElse(Difficulty.NORMAL);
    }
}
