package ru.mirea.task2;

public class Shape
{
    protected String color;
    protected boolean filled;

    Shape(){

    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public String toString(){
        return "Shape {color='" + this.color + "'" + ", filled=" + this.filled + "}";
    }

}

