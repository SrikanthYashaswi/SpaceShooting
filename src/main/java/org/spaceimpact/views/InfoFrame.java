package org.spaceimpact.views;

import org.spaceimpact.models.Frame;

public class InfoFrame extends Frame {
    public InfoFrame(String name, String dateOfBirth, int xOffset, int yOffset) {
        super();
        addPixel(1 + xOffset, 1 + yOffset, "name");
        addPixel(5 + xOffset, 1 + yOffset, ": " + name);
        addPixel(1 + xOffset, 2 + yOffset, "DOB");
        addPixel(5 + xOffset, 2 + yOffset, ": " + dateOfBirth);
    }
}
