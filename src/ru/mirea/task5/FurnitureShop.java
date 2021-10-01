package ru.mirea.task5;

import java.util.ArrayList;

public class FurnitureShop {
    static ArrayList<Chair> chairs = new ArrayList<Chair>();
    static ArrayList<Table> tables = new ArrayList<Table>();

    public static void main(String[] args){

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
