package stepupPractice;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Serega", new int[]{2, 3, 4, 5});
        System.out.println(student1);
        System.out.println(student1.getGrades());
    }
}