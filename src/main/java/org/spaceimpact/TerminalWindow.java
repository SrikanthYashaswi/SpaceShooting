package org.spaceimpact;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import org.spaceimpact.helpers.GameInputTranslator;
import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.models.base.GameInput;
import org.spaceimpact.models.base.GameWindow;
import org.spaceimpact.models.base.Pixel;

import java.io.IOException;

public class TerminalWindow implements GameWindow {
    private Screen screen;

    public TerminalWindow(int width, int height) throws IOException {
        Terminal terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(width, height)).createTerminal();
        screen = new TerminalScreen(terminal);
        screen.startScreen();
    }

    @Override
    public void print(int x, int y, String str) {
        TextGraphics tg = screen.newTextGraphics();
        tg.putString(x, y, str);
    }

    @Override
    public void print(BaseFrame frame) {
        for (Pixel pixel : frame.getPixels()) {
            print(pixel.getX(), pixel.getY(), pixel.getCharacter());
        }
    }

    @Override
    public void refresh() {
        try {
            screen.refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public GameInput getInputAsync() {
        try {
            return GameInputTranslator.getInput(screen.pollInput());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GameInput.UNDEFINED;
    }

    @Override
    public void clearScreen() {
        screen.clear();
    }

    @Override
    public void gotoxy(int x, int y) {
        screen.setCursorPosition(new TerminalPosition(x, y));
        refresh();
    }
}
