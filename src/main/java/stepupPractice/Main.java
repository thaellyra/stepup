package stepupPractice;

public class Main {
    public static void main(String[] args) {
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(new Point(0, 0), new Point(0, 3), new Point(4,0));
        PolyLine polyLine = new PolyLine(new Point(0, 0), new Point(0, 3), new Point(4,0));
        System.out.println("Длина ломаной линии: " + polyLine.length());
        System.out.println("Длина замкнутой ломаной линии: " + closedPolyLine.length());
    }
}