package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args){
        Ball test = new Ball(10, 10);

        System.out.println("x: " + test.getX());
        System.out.println("y: " + test.getY());

        test.setX(20);
        test.setY(30);

        System.out.println("upd x: " + test.getX());
        System.out.println("upd y: " + test.getY());

        test.move(5, 10);

        System.out.println("upd moved x: " + test.getX());
        System.out.println("upd moved y: " + test.getY());

        System.out.println(test);
    }
}
