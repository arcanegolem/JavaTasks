package ru.mirea.task1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args){
        int[] array = {1, 2, 3};

        Scanner sc = new Scanner(System.in);

        String cycle = sc.nextLine();

        System.out.println(sum(array, cycle));
    }

    public static int sum(int[] array, String cycle){
        int sum = 0, cnt = 0;
        switch (cycle){
            case "for":{
                for (int value : array){
                    sum += value;
                }
                break;
            }
            case "while":{
                while (cnt < array.length){
                    sum += array[cnt];
                    cnt++;
                }
                break;
            }
            case "do while":{
                do{
                    sum += array[cnt];
                    cnt++;
                }
                while (cnt < array.length);
                break;
            }
        }
        return sum;
    }
}
