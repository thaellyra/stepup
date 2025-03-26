package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println(xPowY(args[0], args[1]));
    }

    public static double xPowY(String x, String y) {
        return pow(parseInt(x), parseInt(y));
    }
}