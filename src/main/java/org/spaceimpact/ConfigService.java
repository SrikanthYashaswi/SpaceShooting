package org.spaceimpact;

public class ConfigService {
    private final int windowWidth;
    private final int windowHeight;
    private final int playAreaXOrigin;
    private final int playAreaYOrigin;
    private final int playAreaXBoundary;
    private final int playAreaYBoundary;

    public ConfigService(int windowWidth, int windowHeight, int playAreaXOrigin, int playAreaYOrigin, int playAreaXBoundary, int playAreaYBoundary) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.playAreaXOrigin = playAreaXOrigin;
        this.playAreaYOrigin = playAreaYOrigin;
        this.playAreaXBoundary = playAreaXBoundary;
        this.playAreaYBoundary = playAreaYBoundary;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getPlayAreaXOrigin() {
        return playAreaXOrigin;
    }

    public int getPlayAreaYOrigin() {
        return playAreaYOrigin;
    }

    public int getPlayAreaXBoundary() {
        return playAreaXBoundary;
    }

    public int getPlayAreaYBoundary() {
        return playAreaYBoundary;
    }
}
