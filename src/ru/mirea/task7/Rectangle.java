package ru.mirea.task7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(){
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
