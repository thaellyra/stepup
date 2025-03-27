package ru.courses.main;

import spices.Sauce;
import spices.Spicy;

public class Main {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Шрирача", Spicy.VERY_SPICY);
        Sauce sauce2 = new Sauce("Кетчуп", Spicy.SPICY);
        Sauce sauce3 = new Sauce("Майонез", Spicy.NOT_SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}