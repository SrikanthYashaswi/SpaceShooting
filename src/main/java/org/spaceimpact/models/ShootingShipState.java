package org.spaceimpact.models;

import org.spaceimpact.models.base.Sprite;
import org.spaceimpact.models.base.Bullet;

import java.util.ArrayList;
import java.util.List;

public class ShootingShipState {
    private PlayerShip playerShip;
    private ComputerShip computerShip;
    private List<Bullet> bullets;

    public ShootingShipState(PlayerShip playerShip, ComputerShip computerShip) {
        this.playerShip = playerShip;
        this.computerShip = computerShip;
        bullets = new ArrayList<>();
    }

    public PlayerShip getPlayerShip() {
        return playerShip;
    }

    public ComputerShip getComputerShip() {
        return computerShip;
    }

    public List<Bullet> getBullets() {
        return this.bullets;
    }

    public void addBullet(Bullet bullet) {
        this.bullets.add(bullet);
    }

    public Frame toFrame() {
        Frame frame = new Frame();
        frame.addPixel(playerShip);
        frame.addPixel(computerShip);
        frame.addPixels(new ArrayList<>(bullets));
        return frame;
    }

    public void flushInactiveSprites() {
        this.bullets.removeIf(Sprite::isInactive);
    }
}
