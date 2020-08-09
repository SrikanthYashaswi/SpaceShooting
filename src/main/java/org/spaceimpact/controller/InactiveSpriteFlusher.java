package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.Sprite;

public class InactiveSpriteFlusher extends Controller<ShootingShipState> {

    @Override
    public void update(ShootingShipState state) {
        state.getBullets().removeIf(Sprite::isInactive);
    }
}
