package org.spaceimpact.environment;

import org.spaceimpact.controller.Controller;
import org.spaceimpact.models.Frame;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.models.base.GameEnvironment;
import org.spaceimpact.models.base.GameInput;

public class ShootingShipEnvironment implements GameEnvironment {
    private final BaseFrame[] staticFrames;
    private final ShootingShipState state;
    private final Controller<ShootingShipState> controllerChain;

    public ShootingShipEnvironment(ShootingShipState state, Controller<ShootingShipState> controllerChain, BaseFrame... staticFrames) {
        this.state = state;
        this.controllerChain = controllerChain;
        this.staticFrames = staticFrames;
    }

    @Override
    public BaseFrame updateEnvironment(GameInput input) {
        state.setUserInput(input);
        controllerChain.execute(state);
        return buildFrame();
    }

    private BaseFrame buildFrame() {
        Frame frame = state.toFrame();
        for (BaseFrame staticFrame : this.staticFrames) {
            frame.addPixels(staticFrame.getPixels());
        }
        return frame;
    }
}
