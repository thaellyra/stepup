package stepupPractice;

public class Square extends Figure {
    private final int a;

    public Square(int x, int y, int a) {
        super(x, y);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return String.format("{x = %s, y = %s, a = %s}", super.getX(), super.getY(), a);
    }
}
