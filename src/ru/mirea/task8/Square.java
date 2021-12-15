package ru.mirea.task8;

import java.awt.*;

public class Square extends Shape {
    private final int side;

    public Square(int x, int y, int side, Color color) {
        super(x, y, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
