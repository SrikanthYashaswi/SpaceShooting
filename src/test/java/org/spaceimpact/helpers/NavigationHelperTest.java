package org.spaceimpact.helpers;

import org.junit.Test;
import org.spaceimpact.models.base.GameInput;
import org.spaceimpact.models.base.Location;

import static org.junit.Assert.assertEquals;

public class NavigationHelperTest {

    @Test
    public void shouldResolveForRight() {
        Location actual = NavigationHelper.getNext(GameInput.RIGHT, 1,1);

        assertEquals(actual.getX(), 2);
        assertEquals(actual.getY(), 1);
    }

    @Test
    public void shouldResolveForLeft() {
        Location actual = NavigationHelper.getNext(GameInput.LEFT, 2,1);

        assertEquals(actual.getX(), 1);
        assertEquals(actual.getY(), 1);
    }

    @Test
    public void shouldResolveForUp() {
        Location actual = NavigationHelper.getNext(GameInput.UP, 1,2);

        assertEquals(actual.getX(), 1);
        assertEquals(actual.getY(), 1);
    }

    @Test
    public void shouldResolveForDown() {
        Location actual = NavigationHelper.getNext(GameInput.DOWN, 1,1);

        assertEquals(actual.getX(), 1);
        assertEquals(actual.getY(), 2);
    }
}
