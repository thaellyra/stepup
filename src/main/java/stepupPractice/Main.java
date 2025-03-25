package stepupPractice;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 10);
        Square square = new Square(1, 2, 4);
        Rectangle rectangle = new Rectangle(3, 5, 5, 6);

        System.out.printf("Площадь круга с параметрами %s равна %s\n", circle, area(circle));
        System.out.printf("Площадь квадрата с параметрами %s равна %s\n", square, area(square));
        System.out.printf("Площадь прямоугольника с параметрами %s равна %s\n", rectangle, area(rectangle));
    }

    public static double area(Measurable m) {
        return m.getArea();
    }
}