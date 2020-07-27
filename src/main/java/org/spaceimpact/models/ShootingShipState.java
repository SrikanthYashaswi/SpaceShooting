package org.spaceimpact.models;

import org.spaceimpact.models.base.Bullet;
import org.spaceimpact.models.base.Sprite;

import java.util.ArrayList;
import java.util.List;

public class ShootingShipState {
    private PlayerShip playerShip;
    private ComputerShip computerShip;
    private List<Bullet> bullets;
    private GameStats stats;

    public ShootingShipState(PlayerShip playerShip, ComputerShip computerShip, GameStats stats) {
        this.playerShip = playerShip;
        this.computerShip = computerShip;
        this.stats = stats;
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
        frame.addPixel(stats);
        frame.addPixels(new ArrayList<>(bullets));
        return frame;
    }

    public void flushInactiveSprites() {
        this.bullets.removeIf(Sprite::isInactive);
    }

    public GameStats getStats() {
        return stats;
    }
}
