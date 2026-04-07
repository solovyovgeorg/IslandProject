
import conf.Config;
import conf.SimpleConfig;
import engine.Engine;

public class App {
    static void main(String[] args) {
        Config config = new SimpleConfig();
        Engine engine = new Engine(config);
        engine.startSimulation();
    }
}
