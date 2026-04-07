package engine;
import conf.Config;
import engine.generators.IslandGenerator;
import engine.handlers.EventHandler;
import island.Island;
import java.util.ArrayList;

public class Engine {
    private final Config config;
    private Island island;
    private ArrayList<EventHandler> eventHandlers;

    public Engine(Config config) {
        this.config = config;
    }

    public void startSimulation() {
    initIsland();
    }
    public void initIsland() {
        island = new IslandGenerator(config).generate();
    }

    public void stopSimulation() {
    }
}

