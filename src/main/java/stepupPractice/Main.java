package stepupPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumAll(2, (double) 3 / 5, 2.3));
    }

    public static double sumAll(Number... numbers) {
        double sum = 0;
        for (Number curNum : numbers) {
            sum += curNum.doubleValue();
        }
        return sum;
    }
}