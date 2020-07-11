package org.spaceimpact.helpers;

import org.spaceimpact.models.GameInput;
import org.spaceimpact.models.base.Location;

public class NavigationHelper {

    public static Location getNext(GameInput gameInput, int x, int y) {
        switch (gameInput) {
            case Up:
                y--;
                break;
            case Down:
                y++;
                break;
            case Left:
                x--;
                break;
            case Right:
                x++;
                break;
            default:
        }
        return new Location(x, y);
    }
}
