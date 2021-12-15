package ru.mirea.task8;

import java.awt.Color;

public class Rectangle extends Shape{

    private final int height, width;

    public Rectangle(int x, int y, int h, int w, Color color) {
        super(x, y, color);
        this.height = h;
        this.width = w;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
