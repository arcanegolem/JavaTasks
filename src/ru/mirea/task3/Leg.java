package ru.mirea.task3;

public class Leg {
    private double length;
    private double shoe_size;

    public Leg(double length, double shoe_size){
        this.length = length;
        this.shoe_size = shoe_size;
    }

    public double getLength() {
        return length;
    }

    public double getShoe_size() {
        return shoe_size;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setShoe_size(double shoe_size) {
        this.shoe_size = shoe_size;
    }
}
