package org.spaceimpact.models.base;

public abstract class Bullet extends Sprite {
    private Direction travelDirection;

    public Bullet(int x, int y, String character, Direction travelDirection) {
        super(x, y, character);
        this.travelDirection = travelDirection;
    }

    public Direction getTravelDirection() {
        return travelDirection;
    }
}
