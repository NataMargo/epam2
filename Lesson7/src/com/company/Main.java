package com.company;


public class Main {

    public static void main(String[] args) {

        Shape[] Figure = new Shape[]{
                new Rectangle("blue", 5.5, 7.8),
                new Rectangle("red", 7.5, 3.8),
                new Rectangle("black", 9.5, 5.8),
                new Rectangle("violet", 3.5, 4.8),
                new Circle("white", 7),
                new Circle("blue", 4.5),
                new Circle("orange", 11),
                new Triangle("white", 7.2, 10, 5),
                new Triangle("green", 8.7, 11, 7)
        };


        for (int i = 0; i < Figure.length; i++) {
            System.out.println(Figure[i].toString() + " " + Figure[i].calcArea());

        }
        System.out.println("----------------------");
        int i = 0;
        double result = 0.0;
        for (Shape elem : Figure) {
            result += Figure[i].calcArea();
            i++;
        }
        System.out.println("Square of all figures =" + result);
        System.out.println("----------------------");
        int n = 0;
        double squareCircle = 0;
        double squareTriangle = 0;
        double squareRect = 0;
        for (Shape elem : Figure) {

            if (Figure[n] instanceof Rectangle) {

                squareRect += Figure[n].calcArea();
            } else if (Figure[n] instanceof Circle) {
                squareCircle += Figure[n].calcArea();
            } else if (Figure[n] instanceof Triangle) {
                squareTriangle += Figure[n].calcArea();
            }
            n++;


        }
        System.out.println("square of circles= " + squareCircle);
        System.out.println("square of triangles= " + squareTriangle);
        System.out.println("square of rectangles= " + squareRect);
    }
}


   /* public static double squareFigures() {



        System.out.println( squareFigures() );
        return 5.5;
    }
}





//− опишите класс Main с методом main(), в котором создайте массив фигур
//(четыре прямоугольника, три окружности, два треугольника) и
//отобразите его в консоль вместе с информацией о площади фигур.
//Предусмотрите для вывода массива фигур некоторый метод класса Main.
//− добавьте в класс Main метод вычисления общей площади всех фигур
//созданного массива.
//− добавьте в класс Main метод вычисления общей площади фигур каждого
//типа в созданном массиве (т.е. метод возвращает массив суммарных
//площадей каждого типа фигур).
//− добавьте в метод main() вызов описанных методов.
//
//Требования:
//1) При кодировании должны быть использованы соглашения об
//оформлении кода для языка Java.
//2) Используйте оператор instanceof для определения типа фигуры.*/