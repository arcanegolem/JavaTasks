package ru.mirea.task6;

public class Tests {
    public static void main(String[] args){
        Car tc = new Car("Opel Astra", 1000000);
        Smartphone sp = new Smartphone("iPhone X", 90000);

        System.out.println("Car name: " + tc.getName());
        System.out.println("Car price: " + tc.getPrice());

        System.out.println("Smartphone name: " + sp.getName());
        System.out.println("Smartphone price: " + sp.getPrice());
    }
}
