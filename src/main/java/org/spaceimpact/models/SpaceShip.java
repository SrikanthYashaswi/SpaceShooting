package org.spaceimpact.models;

public class SpaceShip extends Ship {

    public SpaceShip(int x, int y) {
        super(x, y, ">");
        this.setCannonDirection(Direction.EAST);
    }

    public void moveUp() {
        setY(getY() - 1);
    }

    public void moveDown() {
        setY(getY() + 1);
    }
}
