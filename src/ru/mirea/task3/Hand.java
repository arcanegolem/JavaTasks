package ru.mirea.task3;

public class Hand {
    private double length;
    private double palm_length;

    public Hand(double length, double palm_length){
        this.length = length;
        this.palm_length = palm_length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getPalm_length() {
        return palm_length;
    }

    public void setPalm_length(double palm_length) {
        this.palm_length = palm_length;
    }
}
