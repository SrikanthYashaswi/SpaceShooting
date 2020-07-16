package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.ComputerShip;
import org.spaceimpact.models.PlayerShip;

public class ShootingShipStateFactory {

    private final ConfigService configService;

    public ShootingShipStateFactory(ConfigService configService) {
        this.configService = configService;
    }

    public ShootingShipState getState() {
        PlayerShip playerShip = new PlayerShip(1, 1);
        ComputerShip computerShip = new ComputerShip(configService.getWindowWidth() - 2, configService.getWindowHeight() - 2);
        return new ShootingShipState(playerShip, computerShip);
    }
}
