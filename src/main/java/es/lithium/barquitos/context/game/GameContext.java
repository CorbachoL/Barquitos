package es.lithium.barquitos.context.game;

import es.lithium.barquitos.constant.Difficulty;

import java.time.LocalDateTime;

public class GameContext {

    private Difficulty difficulty;
    private LocalDateTime initTimestamp;
    private int punctuation;

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public LocalDateTime getInitTimestamp() {
        return initTimestamp;
    }

    public void setInitTimestamp(LocalDateTime initTimestamp) {
        this.initTimestamp = initTimestamp;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(int punctuation) {
        this.punctuation = punctuation;
    }
}
