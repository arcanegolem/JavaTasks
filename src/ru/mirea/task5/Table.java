package ru.mirea.task5;

public class Table extends Furniture {
    private double height;
    private double width;

    public Table(String name, String material, double height, double width, double price){
        super(name, "Table", material, price);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String toString(){
        return (type + "\n\tНаименование: " + name + "\n\tМатериал: " + material + "\n\tЦена: " + price + "\n\tВысота: "
                + height + "\n\tШирина: " + width);
    }
}
