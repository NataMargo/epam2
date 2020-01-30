package com.company;

public class Rectangle extends Shape {

    double  width;
    double  height;

     public Rectangle(String color , double w, double h)
     {
         super(color);
         width = w;
         height = h;
     }



    @Override
    public String toString() {
        return "Rectangle "+color;
     //   return super.toString();
    }

    @Override
    public double calcArea() {
        var square = width * height;
        return square;
    }
}
//опишите класс Rectangle как подкласс Shape. Класс Rectangle содержит:
////поля width и height, конструктор, переопределенные методы toString() и
////calcArea().
