package org.spaceimpact.models.bullet;

import org.spaceimpact.models.Direction;

public class PowerBullet extends Bullet {
    public PowerBullet(int x, int y, Direction travelDirection) {
        super(x, y, "✧", travelDirection);
    }

    @Override
    public void move() {
        if (Direction.EAST.equals(getTravelDirection())) {
            this.setX(getX() + 3);
        }
        if (Direction.WEST.equals(getTravelDirection())) {
            this.setX(getX() - 3);
        }
    }
}
