package org.spaceimpact.controller;

import org.spaceimpact.TerminalWindow;
import org.spaceimpact.environment.ShootingShipEnvironment;
import org.spaceimpact.io.EnvironmentPlayer;
import org.spaceimpact.models.GameEnvironment;
import org.spaceimpact.models.GameWindow;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.views.BorderFrame;

import java.io.IOException;

public class GameController {

    private final EnvironmentPlayer environmentPlayer;

    public GameController(int width, int height) throws IOException {
        GameWindow window = new TerminalWindow(width, height);

        BulletController bulletController = new BulletController(width - 2);
        GameEnvironment environment = new ShootingShipEnvironment(bulletController);

        BaseFrame border = new BorderFrame(0, 0, width - 1, height - 1);

        environmentPlayer = new EnvironmentPlayer(window, environment, border);
    }

    public void start() {
        environmentPlayer.run();
    }
}
