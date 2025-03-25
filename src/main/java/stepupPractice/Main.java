package stepupPractice;

public class Main {
    public static void main(String[] args) {
        Vorobey vorobey1 = new Vorobey();
        Vorobey vorobey2 = new Vorobey();
        Vorobey vorobey3 = new Vorobey();
        Kukushka kukushka1 = new Kukushka();
        Kukushka kukushka2 = new Kukushka();
        Popugay popugay1 = new Popugay("Расцветали яблони и груши");
        Popugay popugay2 = new Popugay("бим-бим бом-бом");
        Popugay popugay3 = new Popugay("раз-два-три-четыре-пять");

        singAll(vorobey1, vorobey2, vorobey3, kukushka1, kukushka2, popugay1, popugay2, popugay3);
    }

    public static void singAll(Bird... birds) {
        int vorobeyCount = 1;
        int kukushkaCount = 1;
        int popugayCount = 1;
        for (Bird bird : birds) {
            if (bird instanceof Vorobey) System.out.println("==Воробей " + vorobeyCount++ + "==");
            else if (bird instanceof Kukushka) System.out.println("==Кукушка " + kukushkaCount++ + "==");
            else if (bird instanceof Popugay) System.out.println("==Попугай " + popugayCount++ + "==");
            bird.sing();
        }
    }
}