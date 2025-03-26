package ru.courses.geometry;

public class Circle extends Figure {
    private final int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return String.format("{x = %s, y = %s, r = %s}", super.getX(), super.getY(), r);
    }
}
