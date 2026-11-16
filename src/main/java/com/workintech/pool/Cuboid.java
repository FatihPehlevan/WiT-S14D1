package com.workintech.pool;

public class Cuboid extends Rectangle{
    private int height;

    public Cuboid (int height, int width, int length) {
        super(width, length);
        this.height = Math.max(height, 0);
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return getArea() * height;
    }
}
