package org.spaceimpact.factories;

import org.spaceimpact.ConfigService;
import org.spaceimpact.environment.ShootingShipEnvironment;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.controller.ShootingShipStateController;
import org.spaceimpact.models.base.GameEnvironment;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.views.BorderFrame;

public class SimpleShootingShipEnvironmentFactory {
    private SimpleShootingShipEnvironmentFactory() {
    }

    public static GameEnvironment getEnvironment(ConfigService configService) {

        ShootingShipStateController stateController = ShootingShipControllerFactory.getStateController(configService);

        ShootingShipState state = ShootingShipStateFactory.getState(configService);

        BaseFrame border = new BorderFrame(configService.getPlayAreaXOrigin(), configService.getPlayAreaYOrigin(),
                configService.getWindowWidth() - 1, configService.getWindowHeight() - 1);

        return new ShootingShipEnvironment(state, stateController, border);
    }
}
