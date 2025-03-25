package stepupPractice;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(333333333, 44444444);
        System.out.println("Дробь: " + fr);
        System.out.println("intValue(fr) = " + fr.intValue());
        System.out.println("longValue(fr) = " + fr.longValue());
        System.out.println("floatValue(fr) = " + fr.floatValue());
        System.out.println("doubleValue(fr) = " + fr.doubleValue());
    }
}