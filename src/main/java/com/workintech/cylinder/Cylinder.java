package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder (double height, int radius) {

        super(radius);

        this.height = Math.max(height, 0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume () {
        return getArea() * height;
    }
}
