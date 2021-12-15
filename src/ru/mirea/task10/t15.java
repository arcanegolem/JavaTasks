package ru.mirea.task10;

public class t15 {
    public static void main(String[] args){
        reverseNumber(124123);
    }

    public static void reverseNumber(int number){
        int digit = number % 10;

        if (number / 10 != 0){

            System.out.println(digit);
            reverseNumber(number / 10);
        }
        else{
            System.out.println(digit);
        }
    }
}
