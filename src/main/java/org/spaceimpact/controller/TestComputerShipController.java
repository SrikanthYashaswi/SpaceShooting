package org.spaceimpact.controller;

import org.spaceimpact.Config;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.SimpleBullet;

public class TestComputerShipController extends ComputerShipController {
    private int counter = 0;

    public TestComputerShipController(Config config) {
        super(config);
    }

    @Override
    public void update(ShootingShipState state) {
        if ((counter = (counter + 1) % config.getComputerShipMovementDelay()) != 0) {
            return;
        }
        state.addBullet(new SimpleBullet(state.getComputerShip().getX(), state.getComputerShip().getY(),
                state.getComputerShip().getCannonDirection()));
    }
}
