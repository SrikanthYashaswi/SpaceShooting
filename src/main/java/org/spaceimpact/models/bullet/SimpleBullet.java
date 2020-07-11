package org.spaceimpact.models.bullet;

import org.spaceimpact.models.Direction;

public class SimpleBullet extends Bullet {
    public SimpleBullet(int x, int y, Direction travelDirection) {
        super(x, y, "-", travelDirection);
    }

    @Override
    public void move() {
        if (Direction.EAST.equals(getTravelDirection())) {
            this.setX(getX() + 1);
        }
        if (Direction.WEST.equals(getTravelDirection())) {
            this.setX(getX() - 1);
        }
    }
}
