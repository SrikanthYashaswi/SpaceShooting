package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;

public class GameStatsUpdater {
    public void updateStats(ShootingShipState state) {
        state.getStats().setHealthPoints(state.getPlayerShip().getHealth());
    }
}
