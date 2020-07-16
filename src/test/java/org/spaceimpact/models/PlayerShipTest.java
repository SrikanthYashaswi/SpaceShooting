package org.spaceimpact.models;

import org.junit.Test;
import org.spaceimpact.models.base.Direction;

import static org.junit.Assert.assertEquals;

public class PlayerShipTest {

    @Test
    public void shouldInitializeSpaceShip() {
        PlayerShip ship = new PlayerShip(0,0);

        assertEquals(ship.getCannonDirection(), Direction.RIGHT);
        assertEquals(ship.getX(), 0);
        assertEquals(ship.getY(), 0);
    }
}
