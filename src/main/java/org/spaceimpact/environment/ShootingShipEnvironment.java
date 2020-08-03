package org.spaceimpact.environment;

import org.spaceimpact.controller.ShootingShipStateController;
import org.spaceimpact.models.Frame;
import org.spaceimpact.models.base.GameEnvironment;
import org.spaceimpact.models.base.GameInput;
import org.spaceimpact.models.ShootingShipState;
import org.spaceimpact.models.base.BaseFrame;

public class ShootingShipEnvironment implements GameEnvironment {
    private final BaseFrame[] staticFrames;
    private final ShootingShipState state;
    private final ShootingShipStateController controller;

    public ShootingShipEnvironment(ShootingShipState state, ShootingShipStateController controller, BaseFrame... staticFrames) {
        this.state = state;
        this.controller = controller;
        this.staticFrames = staticFrames;
    }

    @Override
    public BaseFrame updateEnvironment(GameInput input) {
        this.controller.updateState(this.state, input);
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
