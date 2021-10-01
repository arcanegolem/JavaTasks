package ru.mirea.task5;

public abstract class Dish {
    protected String material;
    protected String name;

    public Dish(String material, String name){
        this.material = material;
        this.name = name;
    }

    public abstract void showProperties();
}
