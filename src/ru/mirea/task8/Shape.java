package ru.mirea.task8;

import java.awt.Color;

public abstract class Shape {
    protected int x, y;
    protected Color color;

    Shape(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Color getColor() {
        return color;
    }
}
