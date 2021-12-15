package ru.mirea.task8;

import java.awt.*;

public class Oval extends Shape{
    private final int diameter1, diameter2;

    public Oval(int x, int y, int d1, int d2, Color color) {
        super(x, y, color);
        this.diameter1 = d1;
        this.diameter2 = d2;
    }

    public int getDiameter1() {
        return diameter1;
    }

    public int getDiameter2() {
        return diameter2;
    }
}
