package ru.mirea.task5;

public abstract class Furniture {
    protected String type;
    protected String name;
    protected String material;
    protected double price;

    public Furniture(String name, String type, String material, double price){
        this.material = material;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getType(){
        return this.type;
    }
    public String getMaterial(){
        return this.material;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
