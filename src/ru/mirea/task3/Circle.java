package ru.mirea.task3;

public class Circle {
    private double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
}
