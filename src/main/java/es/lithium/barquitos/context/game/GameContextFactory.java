package es.lithium.barquitos.context.game;

import es.lithium.barquitos.constant.Difficulty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameContextFactory {

    public GameContext init() throws IllegalAccessException {

        String difficultyString = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter difficulty (EASY, NORMAL, COMPLEX): ");
            difficultyString = br.readLine();

        } catch (IOException e) {
            System.out.println("[ERROR] Exception reading the console");
            throw new IllegalAccessException();
        }

        Difficulty difficulty = Difficulty.from(difficultyString);
        return new GameContext(difficulty);
    }
}
