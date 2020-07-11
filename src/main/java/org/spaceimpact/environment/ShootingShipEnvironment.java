package org.spaceimpact.environment;

import org.spaceimpact.controller.BulletController;
import org.spaceimpact.models.*;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.models.base.Sprite;
import org.spaceimpact.models.bullet.Bullet;
import org.spaceimpact.models.bullet.PowerBullet;
import org.spaceimpact.models.bullet.SimpleBullet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShootingShipEnvironment implements GameEnvironment {
    SpaceShip spaceShip;
    List<Bullet> bullets;
    BulletController bulletController;

    public ShootingShipEnvironment(BulletController bulletController) {
        spaceShip = new SpaceShip(1, 1);
        bullets = new ArrayList<>();
        this.bulletController = bulletController;
    }

    @Override
    public BaseFrame updateEnvironment(GameInput input) {
        reactTo(input);
        bulletController.moveBulletsInDirection(bullets);
        flushInactiveSprites();
        return buildFrame();
    }

    private void reactTo(GameInput input) {
        switch (input) {
            case Up: {
                spaceShip.moveUp();
                break;
            }
            case Down: {
                spaceShip.moveDown();
                break;
            }
            case Shoot: {
                bullets.add(new SimpleBullet(spaceShip.getX(), spaceShip.getY(), spaceShip.getCannonDirection()));
                break;
            }
            case PowerShoot: {
                bullets.add(new PowerBullet(spaceShip.getX(), spaceShip.getY(), spaceShip.getCannonDirection()));
                break;
            }
        }
    }

    private BaseFrame buildFrame() {
        Frame frame = new Frame();
        frame.addPixel(spaceShip);
        frame.addPixels(bullets.stream().collect(Collectors.toList()));
        return frame;
    }

    private void flushInactiveSprites() {
        bullets.removeIf(Sprite::isInactive);
    }
}
