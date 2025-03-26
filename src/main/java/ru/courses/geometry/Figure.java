package ru.courses.geometry;

public class Figure implements Measurable {
    private final int x, y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
