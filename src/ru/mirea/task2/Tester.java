package ru.mirea.task2;

public class Tester {
    public static void main(String[] args){
        Shape test_shape = new Shape("green", true);

        System.out.println(test_shape.getColor());
        System.out.println(test_shape.toString());

        Ball test_ball = new Ball("leather", "football");

        System.out.println(test_ball.getMaterial());
        System.out.println(test_ball.getType());
    }
}
