package es.lithium.barquitos.context.game;

import es.lithium.barquitos.constant.Difficulty;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
public class GameContext {

    private final Difficulty difficulty;
    private final LocalDateTime initTimestamp;
    private int punctuation;

    public GameContext(Difficulty difficulty) {
        this.difficulty = difficulty;
        this.initTimestamp = LocalDateTime.now();
        this.punctuation = 0;
    }

    /**
     * @return game duration in format "Hh MMm SSs"
     */
    public String gameDuration() {

        return Duration.between(initTimestamp, LocalDateTime.now()).toString()
                .substring(2)
                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
                .toLowerCase();
    }

}
