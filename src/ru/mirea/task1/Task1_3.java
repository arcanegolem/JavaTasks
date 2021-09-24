package ru.mirea.task1;

public class Task1_3 {
    public static void main(String[] args){
        for (int i = 1; i < 11; i++){
            float number = 1F/i;
            System.out.println(String.format("%s - е число гармонического ряда равно %s", i, number));
        }
    }
}
