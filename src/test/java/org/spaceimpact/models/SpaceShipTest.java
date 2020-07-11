package org.spaceimpact.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceShipTest {

    @Test
    public void shouldInitializeSpaceShip() {
        SpaceShip ship = new SpaceShip(0,0);

        assertEquals(ship.getCannonDirection(), Direction.EAST);
        assertEquals(ship.getX(), 0);
        assertEquals(ship.getY(), 0);
    }
}
