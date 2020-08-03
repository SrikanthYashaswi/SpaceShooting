package org.spaceimpact.factories;

import org.spaceimpact.Config;
import org.spaceimpact.controller.*;
import org.spaceimpact.helpers.CollisionDetector;
import org.spaceimpact.helpers.InactiveSpriteFlusher;

public class ShootingShipControllerFactory {
    private ShootingShipControllerFactory() {
    }

    public static ShootingShipStateController getStateController(Config config) {
        ComputerShipController computerShipController = new ComputerShipController(config);

        BulletController bulletController = new BulletController(config.getWindowWidth() - 2);

        CollisionDetector collisionDetector = new CollisionDetector();

        InactiveSpriteFlusher inactiveSpriteFlusher = new InactiveSpriteFlusher();

        PlayerShipController playerShipController = new PlayerShipController(config);

        GameStatsUpdater gameStatsUpdater = new GameStatsUpdater();

        return new ShootingShipStateController(playerShipController, computerShipController,
                bulletController, gameStatsUpdater, collisionDetector, inactiveSpriteFlusher);
    }
}
