package org.spaceimpact.models.base;

public abstract class Ship extends Sprite {
    private Direction cannonDirection;
    private int availableHealth;

    public Ship(int x, int y, String c, int availableHealth) {
        super(x, y, c);
        this.availableHealth = availableHealth;
    }

    public Direction getCannonDirection() {
        return cannonDirection;
    }

    public void setCannonDirection(Direction cannonDirection) {
        this.cannonDirection = cannonDirection;
    }

    public int getAvailableHealth() {
        return this.availableHealth;
    }

    public void impact(int power) {
        this.availableHealth -= power;
        if (this.availableHealth <= 0) {
            this.markInactive();
        }
    }
}
