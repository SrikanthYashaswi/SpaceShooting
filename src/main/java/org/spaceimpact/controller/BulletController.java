package org.spaceimpact.controller;

import org.spaceimpact.models.bullet.Bullet;

import java.util.List;

public class BulletController {
    private int xBoundary;

    public BulletController(int xBoundary) {
        this.xBoundary = xBoundary;
    }

    public void moveBulletsInDirection(List<Bullet> bullets) {
        for (Bullet bullet : bullets) {
            if (bullet.getX() >= xBoundary ) {
                bullet.markInactive();
            } else {
                bullet.move();
            }
        }
    }
}
