package com.company;

class Circle extends Shape{

    double radius;
    final double PI = 3.14159265359;

    public Circle(String color, double rad) {
        super(color);
        radius=rad;
    }

    @Override
    public String toString() {
        return "Circle " + color;
        //return super.toString();
    }

    @Override
    public double calcArea() {
        double square =radius * radius * PI;
        return square;
    }
}


//− опишите класс Circle как подкласс Shape. Класс Circle содержит: поле
////radius, конструктор, переопределенные методы toString() и calcArea().