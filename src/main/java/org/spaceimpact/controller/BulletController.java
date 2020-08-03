package org.spaceimpact.controller;

import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.base.Bullet;

import java.util.List;

public class BulletController {
    private int xBoundary;
    private Direction currentDirection;

    public BulletController(int xBoundary) {
        this.xBoundary = xBoundary;
        currentDirection = Direction.RIGHT;
    }

    public void move(List<Bullet> bullets) {
        for (Bullet bullet : bullets) {
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

    private void toggleMovementDirection() {
        currentDirection = currentDirection == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }
}
