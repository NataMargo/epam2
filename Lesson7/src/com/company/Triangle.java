package com.company;

public class Triangle extends Shape{
    double half_perim;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String color,double a, double b, double c) {
        // init class value
        super(color);
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Triangle "+color;
      //  return super.toString();
    }

    @Override
    public double calcArea() {
        half_perim = ( sideA + sideB + sideC)/2;
        double square = Math.sqrt(half_perim * (half_perim - sideA ) * (half_perim -sideB) * (half_perim -sideC));
        return square;
    }
}
//опишите класс Triangle как подкласс Shape. Класс Triangle содержит:
////поля a, b, c; конструктор, переопределенные методы toString() и
////calcArea().