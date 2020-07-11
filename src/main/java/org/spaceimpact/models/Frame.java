package org.spaceimpact.models;

import org.spaceimpact.models.base.BaseFrame;
import org.spaceimpact.models.base.Pixel;

import java.util.ArrayList;
import java.util.List;

public class Frame implements BaseFrame {
    private List<Pixel> pixels;

    public Frame() {
        this.pixels = new ArrayList<>();
    }

    public void addPixel(Pixel pixel) {
        pixels.add(pixel);
    }

    public void addPixels(List<Pixel> pixels){
        this.pixels.addAll(pixels);
    }

    public void addPixel(int x, int y, String c) {
        pixels.add(new Pixel(x, y, c));
    }

    public List<Pixel> getPixels() {
        return this.pixels;
    }
}
