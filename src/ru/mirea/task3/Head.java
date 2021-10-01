package ru.mirea.task3;

public class Head {
    private String hairstyle;
    private double volume;

    public Head(String hairstyle, double volume){
        this.hairstyle = hairstyle;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
