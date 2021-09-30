package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDog {
    private static ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args){
        Dog d1 = new Dog("Flipper", 4);
        Dog d2 = new Dog("Floyd", 2);
        Dog d3 = new Dog("Sammy", 5);

        addDogs(new Dog[]{d1});

        System.out.println(dogs);

        addDogs(new Dog[]{d2, d3});

        System.out.println(dogs);
    }

    public static void addDogs(Dog[] extension){
        dogs.addAll(Arrays.asList(extension));
    }
}
