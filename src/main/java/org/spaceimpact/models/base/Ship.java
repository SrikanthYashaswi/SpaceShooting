package org.spaceimpact.models.base;

public abstract class Ship extends Sprite {
    private Direction cannonDirection;
    private int availableHealth;

    public Ship(int x, int y, String c) {
        super(x, y, c);
    }

    public Direction getCannonDirection() {
        return cannonDirection;
    }

    public void setCannonDirection(Direction cannonDirection) {
        this.cannonDirection = cannonDirection;
    }

    public void setAvailableHealth(int healthPoints) {
        this.availableHealth = healthPoints;
    }

    public int getAvailableHealth() {
        return this.availableHealth;
    }
}
