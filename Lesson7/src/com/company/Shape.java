package com.company;

public class Shape {
        protected String color;

        public Shape(String color) {
                this.color = color;
        }

        public String toString(){
                return "class =...: color=...:";
        }
        public double calcArea(){
                return 0.0;
        }
}

       // Напишите программу на языке Java, в которой:
//− опишите класс Shape (поле color, конструктор, переопределенный метод
//toString() (строка вида "class=...: color=..."), метод вычисления площади
//фигуры calcArea(), который возвращает значение 0.0) .