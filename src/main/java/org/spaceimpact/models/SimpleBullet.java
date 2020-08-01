package org.spaceimpact.models;

import org.spaceimpact.models.base.Bullet;
import org.spaceimpact.models.base.Direction;

public class SimpleBullet extends Bullet {
    public SimpleBullet(int x, int y, Direction travelDirection) {
        super(x, y, "-", 1, travelDirection);
    }
}
