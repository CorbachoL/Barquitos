package es.lithium.barquitos.init;

import es.lithium.barquitos.context.game.GameContext;
import es.lithium.barquitos.context.game.GameContextFactory;
import es.lithium.barquitos.context.player.AgentContext;
import es.lithium.barquitos.context.player.ComputerContextFactory;
import es.lithium.barquitos.context.player.PlayerContextFactory;
import es.lithium.barquitos.stadistics.StatisticsPrinter;

public class BarquitosInitiator {

    public static void main(String[] args) throws Exception{

        // Initialize game context
        GameContextFactory gameContextFactory = new GameContextFactory();
        GameContext gameContext = gameContextFactory.init();

        // Create player context
        PlayerContextFactory playerContextFactory = new PlayerContextFactory();
        AgentContext playerContext = playerContextFactory.starts();

        // Create computer context
        ComputerContextFactory computerContextFactory = new ComputerContextFactory();
        AgentContext computerContext = computerContextFactory.generateComputerContext();

        // Starts the game
        BarquitosEngine engine = new BarquitosEngine();
        engine.init(gameContext, playerContext, computerContext);

        // Print result and statistics
        StatisticsPrinter statisticsPrinter = new StatisticsPrinter(gameContext, playerContext, computerContext);
        statisticsPrinter.print();

    }
}
