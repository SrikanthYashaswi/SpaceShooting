package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;

public class GameStatsUpdater extends Controller<ShootingShipState> {

    @Override
    public void update(ShootingShipState state) {
        var gameStats = state.getStats();
        gameStats.setPlayerShipHealthPoints(state.getPlayerShip().getHealth());
        gameStats.setComputerShipHealthPoints(state.getComputerShip().getHealth());
    }
}
