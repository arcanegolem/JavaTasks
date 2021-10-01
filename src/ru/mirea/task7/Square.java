package ru.mirea.task7;

public class Square extends Rectangle {
    Square(){}

    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
