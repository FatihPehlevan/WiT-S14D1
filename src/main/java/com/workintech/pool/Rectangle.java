package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int height) {
        this.width = Math.max(width, 0);
        this.length = Math.max(height, 0);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return width * length;
    }
}
