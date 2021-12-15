package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import ru.mirea.task8.Rectangle;

public class App extends JFrame{
    private int amount;
    private String[] types = new String[]{"Circle", "Rectangle", "Oval", "Square"};

    App(int amount){
        this.amount = amount;
    }

    public void exec(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.GRAY);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Random rand = new Random();

        for (int i = 0; i < amount; i++){
            String figure = types[rand.nextInt(3)];

            int x = rand.nextInt(500);
            int y = rand.nextInt(500);
            int d = rand.nextInt(10, 100);

            Color c = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));

            switch (figure) {
                case "Circle" -> {
                    Circle circle = new Circle(x, y, d, c);

                    g.setColor(circle.getColor());
                    g.fillOval(circle.getX(), circle.getY(), circle.getDiameter(), circle.getDiameter());
                    g.setColor(Color.BLACK);
                    g.drawOval(circle.getX(), circle.getY(), circle.getDiameter(), circle.getDiameter());
                }
                case "Rectangle" -> {
                    int h = rand.nextInt(10, 100);
                    int w = rand.nextInt(10, 100);

                    Rectangle rectangle = new Rectangle(x, y, h, w, c);

                    g.setColor(rectangle.getColor());
                    g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getHeight(), rectangle.getWidth());
                    g.setColor(Color.BLACK);
                    g.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getHeight(), rectangle.getWidth());
                }
                case "Oval" -> {
                    int d1 = rand.nextInt(10, 100);
                    int d2 = rand.nextInt(10, 100);

                    Oval oval = new Oval(x, y, d1, d2, c);

                    g.setColor(oval.getColor());
                    g.fillOval(oval.getX(), oval.getY(), oval.getDiameter1(), oval.getDiameter2());
                    g.setColor(Color.BLACK);
                    g.drawOval(oval.getX(), oval.getY(), oval.getDiameter1(), oval.getDiameter2());
                }
                case "Square" -> {
                    Square square = new Square(x, y, d, c);

                    g.setColor(square.getColor());
                    g.fillRect(square.getX(), square.getY(), square.getSide(), square.getSide());
                    g.setColor(Color.BLACK);
                    g.drawRect(square.getX(), square.getY(), square.getSide(), square.getSide());
                }
            }
        }
    }
}
