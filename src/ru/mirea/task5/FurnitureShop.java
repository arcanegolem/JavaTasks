package ru.mirea.task5;

import java.util.ArrayList;

public class FurnitureShop {
    static ArrayList<Chair> chairs = new ArrayList<Chair>();
    static ArrayList<Table> tables = new ArrayList<Table>();

    public static void main(String[] args){
        Chair ch1 = new Chair("chair 1", "wood", 10, 12, 120);
        Chair ch2 = new Chair("chair 2", "steel", 12, 15, 125);

        Table tb1 = new Table("table 1", "wood", 20, 25, 150);
        Table tb2 = new Table("table 2", "plastic", 15, 15, 100);

        addToShop(ch1);
        addToShop(ch2);
        addToShop(tb1);
        addToShop(tb2);

        System.out.println("Показ товаров по типу мебели");
        showByType("chair");

        System.out.println("Показ товаров по материалу");
        showByMaterial("wood");

        System.out.println("Показ товаров по типу мебели и материалу");
        showByTypeAndMaterial("table", "plastic");

        buy("table 1");
    }

    public static void addToShop(Chair chair){
        chairs.add(chair);
    }

    public static void addToShop(Table table){
        tables.add(table);
    }

    public static void showByType(String type){
        switch (type.toLowerCase()){
            case "chair":
                for (Chair value: chairs){
                    System.out.println(value);
                }
                break;
            case "table":
                for (Table value: tables) {
                    System.out.println(value);
                }
                break;
        }
    }

    public static void showByMaterial(String material){
        for (Chair value: chairs){
            if (value.getMaterial().equals(material)){
                System.out.println(value);
            }
        }
        for (Table value: tables){
            if (value.getMaterial().equals(material)){
                System.out.println(value);
            }
        }
    }

    public static void showByTypeAndMaterial(String type, String material) {
        switch (type.toLowerCase()){
            case "chair":
                for (Chair value: chairs){
                    if (value.getMaterial().equals(material)){
                        System.out.println(value);
                    }
                }
                break;
            case "table":
                for (Table value: tables){
                    if (value.getMaterial().equals(material)){
                        System.out.println(value);
                    }
                }
        }
    }

    public static double buy(String name){
        double price = -1;

        for (Chair value: chairs){
            if (value.getName().equals(name)){
                System.out.println("Поздравляем с покупкой " + value.getName() + "\n\tС вашего баланса списано " +
                                    value.getPrice() + " RUB");
                price = value.getPrice();
                chairs.remove(value);
                return price;
            }
        }

        for (Table value: tables){
            if (value.getName().equals(name)){
                System.out.println("Поздравляем с покупкой " + value.getName() + "\n\tС вашего баланса списано " +
                        value.getPrice() + " RUB");
                price = value.getPrice();
                tables.remove(value);
                return price;
            }
        }

        return price;
    }
}
