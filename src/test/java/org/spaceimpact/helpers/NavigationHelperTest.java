package org.spaceimpact.helpers;

import org.junit.Test;
import org.spaceimpact.models.GameInput;
import org.spaceimpact.models.base.Location;

import static org.junit.Assert.assertEquals;

public class NavigationHelperTest {

    @Test
    public void shouldResolveForRight() {
        Location actual = NavigationHelper.getNext(GameInput.Right, 1,1);

        assertEquals(actual.getX(), 2);
        assertEquals(actual.getY(), 1);
    }

    @Test
    public void shouldResolveForLeft() {
        Location actual = NavigationHelper.getNext(GameInput.Left, 2,1);

        assertEquals(actual.getX(), 1);
        assertEquals(actual.getY(), 1);
    }

    @Test
    public void shouldResolveForUp() {
        Location actual = NavigationHelper.getNext(GameInput.Up, 1,2);

        assertEquals(actual.getX(), 1);
        assertEquals(actual.getY(), 1);
    }

    @Test
    public void shouldResolveForDown() {
        Location actual = NavigationHelper.getNext(GameInput.Down, 1,1);

        assertEquals(actual.getX(), 1);
        assertEquals(actual.getY(), 2);
    }
}
