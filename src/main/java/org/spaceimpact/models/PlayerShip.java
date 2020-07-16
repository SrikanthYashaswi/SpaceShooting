package org.spaceimpact.models;

import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.base.Ship;

public class PlayerShip extends Ship {

    public PlayerShip(int x, int y) {
        super(x, y, ">");
        this.setCannonDirection(Direction.RIGHT);
    }
}
