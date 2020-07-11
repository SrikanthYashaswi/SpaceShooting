package org.spaceimpact.models;

import org.spaceimpact.models.base.BaseFrame;

public interface GameWindow {
    void print(int x, int y, String c);
    void refresh();
    GameInput getInputAsync();
    void clearScreen();
    void gotoxy(int x, int y);
    void print(BaseFrame frame);
}
