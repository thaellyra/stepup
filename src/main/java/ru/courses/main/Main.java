package ru.courses.main;

import ru.courses.math.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(1, 3);
        Fraction f4 = new Fraction(4, 10);
        Fraction f5 = f4.clone();

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("f4: " + f4);
        System.out.println("f5: " + f5);
        System.out.println();
        System.out.println("f1 == f2: " + f1.equals(f2));
        System.out.println("f1 == f3: " + f1.equals(f3));
        System.out.println("f2 == f4: " + f2.equals(f4));
        System.out.println("f4 == f5: " + f4.equals(f5));
        System.out.println("===========================");
        System.out.println("(Улучшенное сравнение) f1 == f2: " + f1.equalsAfterBeautify(f2));
        System.out.println("(Улучшенное сравнение) f1 == f3: " + f1.equalsAfterBeautify(f3));
        System.out.println("(Улучшенное сравнение) f2 == f4: " + f2.equalsAfterBeautify(f4));
        System.out.println("(Улучшенное сравнение) f4 == f5: " + f4.equalsAfterBeautify(f5));
    }
}