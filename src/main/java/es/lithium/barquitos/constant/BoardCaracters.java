package es.lithium.barquitos.constant;

public enum BoardCaracters {

    UNKNOWN('~'),
    BOAT('¤'),
    WATER('_'),
    HIT('x');

    private char value;

    BoardCaracters(char value) {
        this.value = value;
    }

    public char print() {
        return value;
    }
}
