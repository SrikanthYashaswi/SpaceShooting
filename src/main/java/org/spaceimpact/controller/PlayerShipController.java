package org.spaceimpact.controller;

import org.spaceimpact.ConfigService;
import org.spaceimpact.models.PlayerShip;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.SimpleBullet;
import org.spaceimpact.models.base.GameInput;

public class PlayerShipController {
    private final ConfigService configService;

    public PlayerShipController(ConfigService configService) {
        this.configService = configService;
    }

    public void move(ShootingShipState state, GameInput input) {
        PlayerShip ship = state.getPlayerShip();
        switch (input) {
            case UP: {
                if (ship.getY() - 1 > configService.getPlayAreaYOrigin()) {
                    ship.moveUp();
                }
                break;
            }
            case DOWN: {
                if (ship.getY() + 1 < configService.getPlayAreaYBoundary()) {
                    ship.moveDown();
                }
                break;
            }
            case SHOOT: {
                state.addBullet(new SimpleBullet(ship.getX(), ship.getY(), ship.getCannonDirection()));
                break;
            }
            default: {

            }
        }
    }
}
