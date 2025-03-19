package stepupPractice;

import java.util.List;

public class Student {
    private final String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int[] grades) {
        this(name);
        for (int grade : grades) {
            if (grade <= 2 || grade >= 5) {
                throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
            }
            this.grades.add(grade);
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int[] grades) {
        for (int grade : grades) {
            if (grade <= 2 || grade >= 5) {
                throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
            }
            this.grades.add(grade);
        }
    }

    public void addGrades(int grade) {
        if (grade <= 2 || grade >= 5) {
            throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
        }
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        String res = String.format("%s: ", name);
        for (int i = 0; i < grades.size(); i++) {
            if (i < grades.size() - 1) {
                res += String.format("%s, ", grades.get(i));
            } else {
                res += String.format("%s", grades.get(i));
            }
        }
        return res;
    }
}
