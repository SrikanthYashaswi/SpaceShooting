package org.spaceimpact.controller;

import org.spaceimpact.models.GameWindow;

public class TravellerSpriteController {

    private final GameWindow window;

    public TravellerSpriteController(GameWindow window) {
        this.window = window;
    }

    public void start() throws InterruptedException {
        int x = 0;
        int y = 0;
        while (true) {
            window.clearScreen();
            window.print(x++, y++, ">");
            window.refresh();
            Thread.sleep(50);
        }
    }
}
