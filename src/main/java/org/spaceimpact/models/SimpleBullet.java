package org.spaceimpact.models;

import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.base.Bullet;

public class SimpleBullet extends Bullet {
    public SimpleBullet(int x, int y, Direction travelDirection) {
        super(x, y, "-", travelDirection);
    }
}
