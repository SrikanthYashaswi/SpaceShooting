package org.spaceimpact.controller;

import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.GameInput;

public class ShootingShipStateController {
    private final PlayerShipController playerShipController;
    private final ComputerShipController computerShipController;
    private final BulletController bulletController;

    public ShootingShipStateController(PlayerShipController playerShipController, ComputerShipController computerShipController,
                                       BulletController bulletController) {
        this.playerShipController = playerShipController;
        this.computerShipController = computerShipController;
        this.bulletController = bulletController;
    }

    public void updateState(ShootingShipState state, GameInput gameInput) {
        playerShipController.move(state, gameInput);
        computerShipController.move(state);
        bulletController.move(state.getBullets());
    }
}
