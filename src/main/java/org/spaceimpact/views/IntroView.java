package org.spaceimpact.views;

import org.spaceimpact.models.GameWindow;

public class IntroView {
    private final GameWindow window;
    private final ViewHelper[] viewHelpers;

    public IntroView(GameWindow window, ViewHelper... viewHelpers) {
        this.window = window;
        this.viewHelpers = viewHelpers;
    }

    public void print() {
        for (ViewHelper viewHelper : viewHelpers) {

        }
    }
}
