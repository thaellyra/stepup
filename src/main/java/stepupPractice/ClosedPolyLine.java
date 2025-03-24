package stepupPractice;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points);
    }

    public double length() {
        double sum = super.length();
        if (this.getPoints().length > 2) {
            sum += new PolyLine(this.getPoints()[0], this.getPoints()[this.getPoints().length - 1]).length();
        }
        return sum;
    }

    @Override
    public double getLength() {
        return length();
    }
}
