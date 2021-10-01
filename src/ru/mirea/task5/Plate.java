package ru.mirea.task5;

public class Plate extends Dish {
    private String size;

    public Plate(String material, String name, String size){
        super(material, name);
        this.size = size;
    }

    @Override
    public void showProperties() {
        System.out.printf("Тарелка \nНазвание: %s\nМатериал: %s\nРазмер: %s", this.name, this.material, this.size);
    }
}
