package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args){
        Circle test_circle = new Circle(10);

        System.out.println(test_circle.getRadius());
        test_circle.setRadius(15);
        System.out.println(test_circle.getRadius());

        System.out.println("Площадь: " + test_circle.getArea());
        System.out.println("Периметр: " + test_circle.getPerimeter());
    }
}
