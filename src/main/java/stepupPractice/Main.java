package stepupPractice;

public class Main {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine(new Point(0, 0), new Point(0, 3), new Point(4,0));
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(new Point(0, 0), new Point(0, 3), new Point(4,0));

        System.out.println("Длина ломаной линии: " + getLength(polyLine));
        System.out.println("Длина замкнутой ломаной линии: " + getLength(closedPolyLine));

        String str = "1234212jhfjksadhkfjhskj";
        System.out.printf("Длина текста \"%s\" равна %s%n", str, getLength(str));
    }

    public static double getLength(Measurable measurable) {
        return measurable.getLength();
    }

    public static int getLength(String str) {
        return str.length();
    }
}