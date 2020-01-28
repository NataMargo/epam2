package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Books Books = new Books();
        var Scanner = new Scanner(System.in);
        Books.printBook();
        System.out.println("--------------------------");
        Books author = new Books();
        System.out.println("Enter author's name: ");
        String name= Scanner.nextLine();
        author.setBooks(Books.searchBooksAuthor(name));
        author.printBook();
        if (Books.searchBooksAuthor(name).length==0) {
            System.out.println("There is no books of this author");}
        System.out.println("--------------------------");
        Books other = new Books();
        System.out.println("Enter year of publishing: ");
        int year= Scanner.nextInt();
        other.setBooks(Books.searchBooksAfterYear(year));
        other.printBook();
        if (Books.searchBooksAfterYear(year).length==0) {
            System.out.println("There is no books of this year");}
        System.out.println("--------------------------");
        Books price = new Books();
        System.out.println("Enter percent: ");
        int k= Scanner.nextInt();
        price.changePrice(k);
        price.printBook();
    }
}
/*опишите хорошо инкапсулированный класс Book (ID, Название, Автор,
Издательство, Год издания, Количество страниц, Стоимость), т.е. закрытые
поля с методами доступа. Добавьте в класс конструктор со всеми
параметрами. Добавьте в класс метод view() для отображения (вывода)
объекта.
− опишите класс Books, который будет содержать массив объектов (поле)
типа Book; конструктор, принимающий размер массива и выделяющий
память под него; метод добавления одной книги; метод отображения всех
книг в массиве; метод изменения стоимости книг на указанное количество
процентов; метод поиска всех книг указанного автора; метод поиска всех
книг, изданных после указанного года.
− опишите класс с методом main(), в котором ввести размерность массива
книг и создать объект типа Books; создать и добавить объекты типа Book в
объект типа Books; отобразить в консоль набор книг; использовать все
остальные методы класса Books.*/