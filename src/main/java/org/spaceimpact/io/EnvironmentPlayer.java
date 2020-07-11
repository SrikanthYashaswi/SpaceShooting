package org.spaceimpact.io;

import org.spaceimpact.models.GameEnvironment;
import org.spaceimpact.models.GameWindow;
import org.spaceimpact.models.base.BaseFrame;

public class EnvironmentPlayer {
    private final int sleepTimeInMillis = 30;
    private final GameWindow gameWindow;
    private final GameEnvironment gameEnvironment;
    private final BaseFrame[] staticFrames;

    private boolean shouldRun = true;

    public EnvironmentPlayer(GameWindow gameWindow, GameEnvironment gameEnvironment, BaseFrame... staticFrames) {
        this.gameWindow = gameWindow;
        this.gameEnvironment = gameEnvironment;
        this.staticFrames = staticFrames;
    }

    public void run() {
        while (shouldRun) {
            var gameInput = gameWindow.getInputAsync();
            var frame = gameEnvironment.updateEnvironment(gameInput);
            gameWindow.clearScreen();
            for (BaseFrame staticFrame : staticFrames) {
                gameWindow.print(staticFrame);
            }
            gameWindow.print(frame);
            gameWindow.refresh();
            sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(sleepTimeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
