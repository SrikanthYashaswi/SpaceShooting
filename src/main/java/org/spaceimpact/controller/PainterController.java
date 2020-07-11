package org.spaceimpact.controller;

import org.spaceimpact.models.GameInput;
import org.spaceimpact.models.GameWindow;

public class PainterController {

    private final GameWindow gameWindow;
    private int x = 0;
    private int y = 0;
    private boolean write = false;

    public PainterController(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }

    public void start() {
        while (true) {
            GameInput ip = gameWindow.getInputAsync();
            switch (ip) {
                case Up:
                    y--;
                    break;
                case Down:
                    y++;
                    break;
                case Left:
                    x--;
                    break;
                case Right:
                    x++;
                    break;
                case Quit:
                    return;
                case ClearScreen:
                    gameWindow.clearScreen();
                    break;
                case Toggle:
                    write = !write;
                    break;
                default:
            }
            gameWindow.gotoxy(x, y);
            if (write) {
                gameWindow.print(x, y, "█");
            }
        }
    }
}
