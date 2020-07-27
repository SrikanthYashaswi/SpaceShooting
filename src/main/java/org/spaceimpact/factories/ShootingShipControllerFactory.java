package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.controller.*;

public class ShootingShipControllerFactory {
    private ShootingShipControllerFactory() {
    }

    public static ShootingShipStateController getStateController(ConfigService configService) {
        ComputerShipController computerShipController = new ComputerShipController(configService);

        BulletController bulletController = new BulletController(configService.getWindowWidth() - 2);

        PlayerShipController playerShipController = new PlayerShipController();

        GameStatsUpdater gameStatsUpdater = new GameStatsUpdater();

        return new ShootingShipStateController(playerShipController, computerShipController, bulletController, gameStatsUpdater);
    }
}
