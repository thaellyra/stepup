package stepupPractice;

public class Square {
    private int x;
    private int y;
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны обязана быть положительной");
        }
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке {%s;%s} со стороной %s", x, y, sideLength);
    }
}
