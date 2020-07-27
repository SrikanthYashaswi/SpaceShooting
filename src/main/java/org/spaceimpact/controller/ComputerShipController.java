package org.spaceimpact.controller;

import org.spaceimpact.ConfigService;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.SimpleBullet;

import java.util.Random;

public class ComputerShipController {
    private final ConfigService configService;
    private int counter = 0;
    private final int movementDelay = 10;
    private Direction movingDirection = Direction.DOWN;
    private final Random rand = new Random();

    public ComputerShipController(ConfigService configService) {
        this.configService = configService;
    }

    public void move(ShootingShipState state) {
        if (counter++ % movementDelay != 0) {
            return;
        }
        if (shouldFireBullet()) {
            state.addBullet(new SimpleBullet(state.getComputerShip().getX(), state.getComputerShip().getY(),
                    state.getComputerShip().getCannonDirection()));
        }
        moveShip(state);
    }

    private boolean shouldFireBullet() {
        return rand.nextInt(5) == 0;
    }

    private void moveShip(ShootingShipState state) {
        if (state.getComputerShip().getY() > configService.getPlayAreaYBoundary() - 2) {
            movingDirection = Direction.UP;
        }
        if (state.getComputerShip().getY() < configService.getPlayAreaYOrigin() + 2) {
            movingDirection = Direction.DOWN;
        }
        state.getComputerShip().move(movingDirection);
    }
}
