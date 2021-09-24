package ru.mirea.task1;

public class Task1_5 {
    public static void main(String[] args){
        System.out.println(Factorial(10));
    }

    public static int Factorial(int number){
        int factorial = 1;
        for(int i = 1; i < number + 1; i++){
            factorial *= i;
        }

        return factorial;
    }
}
