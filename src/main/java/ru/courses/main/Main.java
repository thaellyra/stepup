package ru.courses.main;

import ru.courses.lines.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Line line1 = new Line(new Point(1, 2), new Point(4, 5));
        Line line2 = new Line(new Point(1, 2), new Point(4, 5));
        Line line3 = new Line(new Point(2, 2), new Point(2, 5));
        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
        System.out.println("line3: " + line3);
        System.out.println("line1 == line2: " + line1.equals(line2));
        System.out.println("line1 == line3: " + line1.equals(line3));
        System.out.println("=================================");
        Line line4 = line3.clone();
        System.out.println("line3: " + line3);
        System.out.println("line4: " + line4);
        System.out.println("line3 == line4: " + line3.equals(line4));
    }
}