package ru.mirea.task10;

import java.util.Scanner;

public class t17 {
    public static void main(String[] args){
        System.out.println(max());
    }

    public static int max(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0){
            return 0;
        }
        return Math.max(number, max());
    }
}
