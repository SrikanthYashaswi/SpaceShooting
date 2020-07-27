package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.ComputerShip;
import org.spaceimpact.models.PlayerShip;

public class ShootingShipStateFactory {
    private ShootingShipStateFactory() {
    }

    public static ShootingShipState getState(ConfigService configService) {
        PlayerShip playerShip = new PlayerShip(configService.getPlayAreaXOrigin() + 1, configService.getPlayAreaYOrigin() + 1);
        ComputerShip computerShip = new ComputerShip(configService.getPlayAreaXBoundary() - 1, configService.getPlayAreaYOrigin() + 1);
        return new ShootingShipState(playerShip, computerShip);
    }
}
