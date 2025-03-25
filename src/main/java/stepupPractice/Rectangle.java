package stepupPractice;

public class Rectangle extends Figure {
    private final int a, b;

    public Rectangle(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("{x = %s, y = %s, a = %s, b = %s}", super.getX(), super.getY(), a, b);
    }
}
