package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.SimpleBullet;

import java.util.Random;

public class ComputerShipController {
    private int counter = 0;
    private final int movementDelay = 10;
    private final int xBoundary;
    private final int yBoundary;
    private Direction movingDirection;
    private final Random rand = new Random();

    public ComputerShipController(int xBoundary, int yBoundary) {
        this.xBoundary = xBoundary;
        this.yBoundary = yBoundary;
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
        if (state.getComputerShip().getY() > yBoundary - 1) {
            movingDirection = Direction.UP;
        }
        if (state.getComputerShip().getY() < 1) {
            movingDirection = Direction.DOWN;
        }
        state.getComputerShip().move(movingDirection);
    }
}
