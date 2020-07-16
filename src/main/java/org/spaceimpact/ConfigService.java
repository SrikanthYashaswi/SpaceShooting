package org.spaceimpact;

public class ConfigService {
    private final int windowWidth;
    private final int windowHeight;

    public ConfigService(int windowWidth, int windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }
}
