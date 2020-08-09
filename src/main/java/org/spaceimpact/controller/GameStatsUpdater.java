package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;

public class GameStatsUpdater extends Controller<ShootingShipState> {

    @Override
    public void update(ShootingShipState state) {
        state.getStats().setHealthPoints(state.getPlayerShip().getHealth());
    }
}
