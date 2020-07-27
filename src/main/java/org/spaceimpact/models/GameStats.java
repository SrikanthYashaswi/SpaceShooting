package org.spaceimpact.models;

import org.spaceimpact.models.base.Pixel;

public class GameStats extends Pixel {
    private int healthPoints = 0;

    public GameStats(int x, int y) {
        super(x, y, "");
    }

    private String getUpdatedCharacter() {
        return "Health: " + "♥ ".repeat(healthPoints);
    }

    private void updateCharacter() {
        this.setCharacter(getUpdatedCharacter());
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        updateCharacter();
    }

}
