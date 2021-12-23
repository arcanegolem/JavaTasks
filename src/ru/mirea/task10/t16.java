package ru.mirea.task10;

import java.awt.*;
import java.util.Scanner;

public class t16 {
    public static void main(String[] args){
        System.out.println(maxCount(0,1));
    }

    public static int maxCount(int old, int count){
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        int cn = count;

        if (tmp != 0){
            if(tmp == old){
                cn += 1;
                cn = maxCount(tmp, cn);
                return cn;
            }
            if(tmp > old){
                cn = 1;
                cn = maxCount(tmp, cn);
                return cn;
            }
            else {
                cn = maxCount(old, cn);
                return cn;
            }

        }

        return cn;
    }
}
