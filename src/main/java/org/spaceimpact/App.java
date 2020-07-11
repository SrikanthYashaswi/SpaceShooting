package org.spaceimpact;

import org.spaceimpact.controller.GameController;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        GameController gameController = new GameController(40,30);
        gameController.start();
    }
}
