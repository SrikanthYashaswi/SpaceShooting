package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.environment.ShootingShipEnvironment;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.controller.ShootingShipStateController;
import org.spaceimpact.models.base.GameEnvironment;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.views.BorderFrame;

public class SimpleShootingShipEnvironmentFactory implements EnvironmentFactory {

    private final ConfigService configService;
    private final ShootingShipStateFactory shootingShipStateFactory;
    private final ShootingShipControllerFactory shootingShipControllerFactory;

    public SimpleShootingShipEnvironmentFactory(ConfigService configService) {
        this.configService = configService;
        this.shootingShipStateFactory = new ShootingShipStateFactory(configService);
        this.shootingShipControllerFactory = new ShootingShipControllerFactory(configService);
    }

    public GameEnvironment getEnvironment() {

        ShootingShipStateController stateController = this.shootingShipControllerFactory.getStateController();

        ShootingShipState state = this.shootingShipStateFactory.getState();

        BaseFrame border = new BorderFrame(0, 0, configService.getWindowWidth() - 1, configService.getWindowHeight() - 1);

        return new ShootingShipEnvironment(state, stateController, border);
    }
}
