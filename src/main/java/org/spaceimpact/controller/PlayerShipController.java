package org.spaceimpact.controller;

import org.spaceimpact.Config;
import org.spaceimpact.models.PlayerShip;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.SimpleBullet;
import org.spaceimpact.models.base.GameInput;

public class PlayerShipController {
    private final Config config;

    public PlayerShipController(Config config) {
        this.config = config;
    }

    public void move(ShootingShipState state, GameInput input) {
        PlayerShip ship = state.getPlayerShip();
        switch (input) {
            case UP: {
                if (ship.getY() - 1 > config.getPlayAreaYOrigin()) {
                    ship.moveUp();
                }
                break;
            }
            case DOWN: {
                if (ship.getY() + 1 < config.getPlayAreaYBoundary()) {
                    ship.moveDown();
                }
                break;
            }
            case SHOOT: {
                state.addBullet(new SimpleBullet(ship.getX() + 1, ship.getY(), ship.getCannonDirection()));
                break;
            }
        }
    }
}
