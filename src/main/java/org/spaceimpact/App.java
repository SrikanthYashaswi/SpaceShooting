package org.spaceimpact;

import org.spaceimpact.environment.EnvironmentPlayer;
import org.spaceimpact.factories.SimpleShootingShipEnvironmentFactory;
import org.spaceimpact.models.base.GameEnvironment;
import org.spaceimpact.models.base.GameWindow;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        startSpaceImpact();
    }

    public static void startSpaceImpact() throws IOException {
        final var config = new Config(60, 30, 0, 1);

        GameWindow window = new TerminalWindow(config.getWindowWidth(), config.getWindowHeight());

        GameEnvironment environment = SimpleShootingShipEnvironmentFactory.getEnvironment(config);

        EnvironmentPlayer environmentPlayer = new EnvironmentPlayer(window, environment);

        environmentPlayer.run();
    }
}
