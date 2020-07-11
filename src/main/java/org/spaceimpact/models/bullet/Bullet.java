package org.spaceimpact.models.bullet;

import org.spaceimpact.models.Direction;
import org.spaceimpact.models.base.Sprite;

public abstract class Bullet extends Sprite {
    private Direction travelDirection;

    public Bullet(int x, int y, String character, Direction travelDirection) {
        super(x, y, character);
        this.travelDirection = travelDirection;
    }

    public abstract void move();

    public Direction getTravelDirection() {
        return travelDirection;
    }
}
