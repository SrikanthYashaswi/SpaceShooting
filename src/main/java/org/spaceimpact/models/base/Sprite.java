package org.spaceimpact.models.base;

public abstract class Sprite extends Pixel {
    private boolean active;

    public Sprite(int x, int y, String c) {
        super(x, y, c);
        active = true;
    }

    public void markInactive() {
        this.active = false;
    }

    public boolean isInactive() {
        return !active;
    }
}
