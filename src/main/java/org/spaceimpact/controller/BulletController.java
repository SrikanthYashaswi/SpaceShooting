package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.Bullet;
import org.spaceimpact.models.base.Direction;

public class BulletController extends Controller<ShootingShipState> {
    private int xBoundary;
    private Direction currentDirection;

    public BulletController(int xBoundary) {
        this.xBoundary = xBoundary;
        currentDirection = Direction.RIGHT;
    }

    private void toggleMovementDirection() {
        currentDirection = currentDirection == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }

    @Override
    public void update(ShootingShipState state) {
        for (Bullet bullet : state.getBullets()) {
            if (bullet.getTravelDirection() == Direction.LEFT && currentDirection == Direction.LEFT) {
                if (bullet.getX() <= 1) {
                    bullet.markInactive();
                } else {
                    bullet.moveLeft();
                }
            } else if (bullet.getTravelDirection() == Direction.RIGHT && currentDirection == Direction.RIGHT) {
                if (bullet.getX() >= xBoundary) {
                    bullet.markInactive();
                } else {
                    bullet.moveRight();
                }
            }
        }
        toggleMovementDirection();
    }
}
