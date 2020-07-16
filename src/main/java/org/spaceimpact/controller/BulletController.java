package org.spaceimpact.controller;

import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.base.Bullet;

import java.util.List;

public class BulletController {
    private int xBoundary;

    public BulletController(int xBoundary) {
        this.xBoundary = xBoundary;
    }

    public void move(List<Bullet> bullets) {
        for (Bullet bullet : bullets) {
            if (bullet.getTravelDirection() == Direction.LEFT) {
                if (bullet.getX() <= 1) {
                    bullet.markInactive();
                } else {
                    bullet.moveLeft();
                }
            } else if (bullet.getTravelDirection() == Direction.RIGHT) {
                if (bullet.getX() >= xBoundary) {
                    bullet.markInactive();
                } else {
                    bullet.moveRight();
                }
            }
        }
    }
}
