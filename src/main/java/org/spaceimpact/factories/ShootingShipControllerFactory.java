package org.spaceimpact.factories;

import org.spaceimpact.Config;
import org.spaceimpact.controller.*;
import org.spaceimpact.controller.CollisionDetector;
import org.spaceimpact.models.ShootingShipState;

public class ShootingShipControllerFactory {
    private ShootingShipControllerFactory() {
    }

    public static Controller<ShootingShipState> getControllerChain(Config config) {
        return ControllerChainBuilder
                .getInstance()
                .setNext(new PlayerShipController(config))
                .setNext(new ComputerShipController(config))
                .setNext(new BulletController(config.getWindowWidth() - 2))
                .setNext(new CollisionDetector())
                .setNext(new GameStatsUpdater())
                .setNext(new InactiveSpriteFlusher())
                .buildChain();
    }
}
