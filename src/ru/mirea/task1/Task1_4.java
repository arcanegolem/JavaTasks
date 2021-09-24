package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String rnd_type = sc.nextLine();
        int[] array = RandomizedArray(rnd_type, 10);

        System.out.println("Задание 4\n_ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Сгенерированный массив: ");

        assert array != null;
        ShowArray(array);

        BubbleSort(array);

        System.out.println("Отсортированный массив: ");

        ShowArray(array);

        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ ");
    }

    public static int[] RandomizedArray(String rnd_type, int length){
        int[] array = new int[length];

        switch (rnd_type){
            case "Random":{
                Random rand = new Random();

                for (int i = 0; i < array.length; i++){
                    array[i] = rand.nextInt(10);
                }
                return array;
            }
            case "Math":{
                for (int i = 0; i < array.length; i++){
                    array[i] = (int)(Math.random() * 10);
                }
                return array;
            }
        }
        return null;
    }

    public static void BubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    public static void ShowArray(int[] array){
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }
}
