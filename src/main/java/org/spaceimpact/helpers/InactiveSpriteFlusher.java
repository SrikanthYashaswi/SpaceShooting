package org.spaceimpact.helpers;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.Sprite;

public class InactiveSpriteFlusher {
    public void flush(ShootingShipState state) {
        state.getBullets().removeIf(Sprite::isInactive);
    }
}
