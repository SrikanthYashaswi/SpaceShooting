package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.controller.PlayerShipController;
import org.spaceimpact.controller.BulletController;
import org.spaceimpact.controller.ComputerShipController;
import org.spaceimpact.controller.ShootingShipStateController;

public class ShootingShipControllerFactory {
    private ShootingShipControllerFactory() {
    }

    public static ShootingShipStateController getStateController(ConfigService configService) {
        ComputerShipController computerShipController = new ComputerShipController(configService);

        BulletController bulletController = new BulletController(configService.getWindowWidth() - 2);

        PlayerShipController playerShipController = new PlayerShipController();

        return new ShootingShipStateController(playerShipController, computerShipController, bulletController);
    }
}
