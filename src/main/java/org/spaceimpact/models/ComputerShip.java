package org.spaceimpact.models;

import org.spaceimpact.models.base.Direction;
import org.spaceimpact.models.base.Ship;

public class ComputerShip extends Ship {
    public ComputerShip(int x, int y) {
        super(x, y, "<", 2);
        setCannonDirection(Direction.LEFT);
    }
}
