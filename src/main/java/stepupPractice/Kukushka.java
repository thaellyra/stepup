package stepupPractice;

public class Kukushka extends Bird {
    @Override
    public void sing() {
        for (int i = 1; i <= (int) (Math.random() * 10) + 1; i++) {
            System.out.println("ку-ку");
        }
    }
}
