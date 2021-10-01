package ru.mirea.task5;

public class Chair extends Furniture {
    private double back_height;
    private double legs_height;

    public Chair(String name, String material, double back_height, double legs_height, double price){
        super(name, "Chair", material, price);
        this.back_height = back_height;
        this.legs_height = legs_height;
    }

    public double getBackHeight() {
        return back_height;
    }

    public double getLegsHeight() {
        return legs_height;
    }

    public String toString(){
        return (type + "\n\tНаименование: " + name + "\n\tМатериал: " + material + "\n\tЦена: " + price + "\n\tВысота " +
                "спинки: " + back_height + "\n\tВысота ножек: " + legs_height);
    }
}
