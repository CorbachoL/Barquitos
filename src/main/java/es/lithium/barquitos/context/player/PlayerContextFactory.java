package es.lithium.barquitos.context.player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayerContextFactory {

    public AgentContext starts() throws IllegalAccessException {

        String name = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter your name: ");
            name = br.readLine();

        } catch (IOException e) {
            System.out.println("[ERROR] Exception reading the console");
            throw new IllegalAccessException();
        }

        //AgentContext playerBoard =

        return new AgentContext(name, null, null);
    }
}
