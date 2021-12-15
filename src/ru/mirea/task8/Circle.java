package ru.mirea.task8;

import java.awt.Color;

public class Circle extends Shape{
    private final int diameter;

    public Circle(int x, int y, int d, Color color) {
        super(x, y, color);
        this.diameter = d;
    }

    public int getDiameter() {
        return diameter;
    }
}