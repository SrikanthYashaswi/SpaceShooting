package org.spaceimpact.models;

import org.spaceimpact.models.base.Sprite;

public abstract class Ship extends Sprite {
    private Direction cannonDirection;

    public Ship(int x, int y, String c) {
        super(x, y, c);
    }

    public Direction getCannonDirection() {
        return cannonDirection;
    }

    public void setCannonDirection(Direction cannonDirection) {
        this.cannonDirection = cannonDirection;
    }
}
