package org.spaceimpact.factories;

import org.spaceimpact.Config;
import org.spaceimpact.controller.*;

public class ShootingShipControllerFactory {
    private ShootingShipControllerFactory() {
    }

    public static ShootingShipStateController getStateController(Config config) {
        ComputerShipController computerShipController = new ComputerShipController(config);

        BulletController bulletController = new BulletController(config.getWindowWidth() - 2);

        PlayerShipController playerShipController = new PlayerShipController(config);

        GameStatsUpdater gameStatsUpdater = new GameStatsUpdater();

        return new ShootingShipStateController(playerShipController, computerShipController, bulletController, gameStatsUpdater);
    }
}
