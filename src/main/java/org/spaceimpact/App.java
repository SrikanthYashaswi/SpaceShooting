package org.spaceimpact;

import org.spaceimpact.factories.SimpleShootingShipEnvironmentFactory;
import org.spaceimpact.factories.EnvironmentFactory;
import org.spaceimpact.environment.EnvironmentPlayer;
import org.spaceimpact.models.base.GameWindow;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        startSpaceImpact();
    }

    public static void startSpaceImpact() throws IOException {
        final var configService = new ConfigService(60, 30);

        GameWindow window = new TerminalWindow(configService.getWindowWidth(), configService.getWindowHeight());

        EnvironmentFactory factory = new SimpleShootingShipEnvironmentFactory(configService);

        EnvironmentPlayer environmentPlayer = new EnvironmentPlayer(window, factory.getEnvironment());

        environmentPlayer.run();
    }
}
