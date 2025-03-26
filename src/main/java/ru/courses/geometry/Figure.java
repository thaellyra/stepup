package ru.courses.geometry;

public class Figure extends Point implements Measurable {
    public Figure(int x, int y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
