package org.spaceimpact.controller;

import org.spaceimpact.helpers.CollisionDetector;
import org.spaceimpact.helpers.InactiveSpriteFlusher;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.GameInput;

public class ShootingShipStateController {
    private final PlayerShipController playerShipController;
    private final ComputerShipController computerShipController;
    private final BulletController bulletController;
    private final GameStatsUpdater gameStatsUpdater;
    private final CollisionDetector collisionDetector;
    private final InactiveSpriteFlusher inactiveSpriteFlusher;

    public ShootingShipStateController(PlayerShipController playerShipController, ComputerShipController computerShipController,
                                       BulletController bulletController, GameStatsUpdater gameStatsUpdater,
                                       CollisionDetector collisionDetector, InactiveSpriteFlusher inactiveSpriteFlusher) {
        this.playerShipController = playerShipController;
        this.computerShipController = computerShipController;
        this.bulletController = bulletController;
        this.gameStatsUpdater = gameStatsUpdater;
        this.collisionDetector = collisionDetector;
        this.inactiveSpriteFlusher = inactiveSpriteFlusher;
    }

    public void updateState(ShootingShipState state, GameInput gameInput) {
        playerShipController.move(state, gameInput);
        computerShipController.move(state);
        bulletController.move(state.getBullets());
        collisionDetector.detect(state);
        gameStatsUpdater.updateStats(state);
        inactiveSpriteFlusher.flush(state);
    }
}
