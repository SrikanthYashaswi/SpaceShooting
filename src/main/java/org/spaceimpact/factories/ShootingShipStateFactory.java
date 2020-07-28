package org.spaceimpact.factories;

import org.spaceimpact.Config;
import org.spaceimpact.models.GameStats;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.ComputerShip;
import org.spaceimpact.models.PlayerShip;

public class ShootingShipStateFactory {
    private ShootingShipStateFactory() {
    }

    public static ShootingShipState getState(Config config) {
        PlayerShip playerShip = new PlayerShip(config.getPlayAreaXOrigin() + 1, config.getPlayAreaYOrigin() + 1);
        ComputerShip computerShip = new ComputerShip(config.getPlayAreaXBoundary() - 1, config.getPlayAreaYOrigin() + 1);
        GameStats stats = new GameStats(config.getStatsOriginX(), config.getStatsOriginY());
        return new ShootingShipState(playerShip, computerShip, stats);
    }
}
