package stepupPractice;

public class Main {
    public static void main(String[] args) {
        Vorobey vorobey = new Vorobey();
        Kukushka kukushka = new Kukushka();
        Popugay popugay = new Popugay("Расцветали яблони и груши");

        sing(vorobey);
        sing(kukushka);
        sing(popugay);
    }

    public static void sing(Singable s) {
        s.sing();
    }
}