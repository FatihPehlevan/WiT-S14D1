package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid (int height, int width, int length) {
        super(width, length);
        this.height = Math.max(height, 0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
