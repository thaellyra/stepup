package ru.courses.main;

import ru.courses.geometry.*;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 10);
        Circle circle2 = new Circle(2, 3, 122);
        Square square1 = new Square(12, 2, 43);
        Square square2 = new Square(1, 23, 4);
        Rectangle rectangle = new Rectangle(3, 5, 5, 6);

        System.out.printf("Площадь круга с параметрами %s равна %s\n", circle1, area(circle1));
        System.out.printf("Площадь круга с параметрами %s равна %s\n", circle2, area(circle2));
        System.out.printf("Площадь квадрата с параметрами %s равна %s\n", square1, area(square1));
        System.out.printf("Площадь квадрата с параметрами %s равна %s\n", square2, area(square2));
        System.out.printf("Площадь прямоугольника с параметрами %s равна %s\n", rectangle, area(rectangle));

        System.out.printf("\nСумма площадей этих фигур равна %s", sumAllAreas(circle1, circle2, square1, square2, rectangle));
    }

    public static double sumAllAreas(Figure... figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getArea();
        }
        return sum;
    }

    public static double area(Measurable m) {
        return m.getArea();
    }
}