package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.controller.PlayerShipController;
import org.spaceimpact.controller.BulletController;
import org.spaceimpact.controller.ComputerShipController;
import org.spaceimpact.controller.ShootingShipStateController;

public class ShootingShipControllerFactory {

    private final ConfigService configService;

    public ShootingShipControllerFactory(ConfigService configService) {
        this.configService = configService;
    }

    public ShootingShipStateController getStateController() {
        ComputerShipController computerShipController = new ComputerShipController(configService.getWindowWidth() - 2, configService.getWindowHeight() - 2);

        BulletController bulletController = new BulletController(configService.getWindowWidth() - 2);

        PlayerShipController playerShipController = new PlayerShipController();

        return new ShootingShipStateController(playerShipController, computerShipController, bulletController);
    }
}
