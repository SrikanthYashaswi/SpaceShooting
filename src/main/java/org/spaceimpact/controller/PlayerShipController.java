package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.GameInput;
import org.spaceimpact.models.PlayerShip;
import org.spaceimpact.models.SimpleBullet;

public class PlayerShipController {
    public void move(ShootingShipState state, GameInput input) {
        PlayerShip ship = state.getPlayerShip();
        switch (input) {
            case UP: {
                ship.moveUp();
                break;
            }
            case DOWN: {
                ship.moveDown();
                break;
            }
            case SHOOT: {
                state.addBullet(new SimpleBullet(ship.getX(), ship.getY(), ship.getCannonDirection()));
                break;
            }
        }
    }
}
