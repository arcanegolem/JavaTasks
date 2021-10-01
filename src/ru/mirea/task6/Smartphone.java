package ru.mirea.task6;

public class Smartphone implements Nameable, Priceable {
    private String name;
    private double price;

    public Smartphone(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
