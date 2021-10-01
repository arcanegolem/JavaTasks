package ru.mirea.task5;

public class Pot extends Dish {
    private double capacity;

    public Pot(String material, String name, double capacity){
        super(material, name);
        this.capacity = capacity;
    }

    @Override
    public void showProperties() {
        System.out.printf("Кастрюля \nНазвание: %s\nМатериал: %s\nОбьем: %s", this.name, this.material, this.capacity);
    }
}
