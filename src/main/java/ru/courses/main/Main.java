package ru.courses.main;

import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        ru.courses.geometry.Point pointGeometry = new ru.courses.geometry.Point(2, 3);
        Point pointAwt = new Point(6, 8);

        System.out.println(pointGeometry);
        System.out.println(pointAwt);
    }
}