package org.spaceimpact.factories;

import org.spaceimpact.Config;
import org.spaceimpact.environment.ShootingShipEnvironment;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.controller.ShootingShipStateController;
import org.spaceimpact.models.base.GameEnvironment;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.views.BorderFrame;

public class SimpleShootingShipEnvironmentFactory {
    private SimpleShootingShipEnvironmentFactory() {
    }

    public static GameEnvironment getEnvironment(Config config) {

        ShootingShipStateController stateController = ShootingShipControllerFactory.getStateController(config);

        ShootingShipState state = ShootingShipStateFactory.getState(config);

        BaseFrame border = new BorderFrame(config.getPlayAreaXOrigin(), config.getPlayAreaYOrigin(),
                config.getWindowWidth() - 1, config.getWindowHeight() - 1);

        return new ShootingShipEnvironment(state, stateController, border);
    }
}
