package es.lithium.barquitos.context.player;

public class ComputerContextFactory {
    public AgentContext generateComputerContext() {

        return new AgentContext("Computer", null, null);
    }
}
