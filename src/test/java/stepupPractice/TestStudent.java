package stepupPractice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.*;

import java.util.List;

public class TestStudent {
    @Test
    @DisplayName("Инкапсуляция поля grades соблюдена")
    public void gradesEncapsulation() {
        Student student = new Student("Pete");
        student.addGrade(3);

        List<Integer> tmpGrades = student.getGrades();
        tmpGrades.add(4);

        Assertions.assertNotEquals(student.getGrades(), tmpGrades);
    }

    @ParameterizedTest
    @MethodSource("stepupPractice.GradeSource#goodGrades")
    @DisplayName("В поле grades добавляются только валидные цифры")
    public void gradesInRange(int x) {
        Student student = new Student("Pete");
        student.addGrade(x);
        Assertions.assertEquals(student.getGrades().getFirst(), x);
    }

    @ParameterizedTest
    @MethodSource("stepupPractice.GradeSource#notGoodGrades")
    @DisplayName("При добавлении невалидных значений в поле grades кидается исключение")
    public void gradesNotInRange(int x) {
        Student student = new Student("Pete");
        Assertions.assertThrows(IllegalArgumentException.class, () -> student.addGrade(x));
    }

    @Test
    @DisplayName("Метод equals возвращает true, если сравнивать один и тот же объект")
    public void equalsTrueOne() {
        Student student = new Student("Pete");
        student.addGrade(2);
        Assertions.assertTrue(student.equals(student));
    }

    @Test
    @DisplayName("Метод equals возвращает true, если поля объектов одинаковые")
    public void equalsTrueTwo() {
        Student student1 = new Student("Pete");
        student1.addGrade(2);
        Student student2 = new Student("Pete");
        student2.addGrade(2);
        Assertions.assertTrue(student1.equals(student2));
    }

    @Test
    @DisplayName("Метод equals возвращает false, если сранивать объект с null")
    public void equalsTrueThree() {
        Student student = new Student("Pete");
        student.addGrade(2);
        Assertions.assertFalse(student.equals(null));
    }

    @Test
    @DisplayName("Метод equals возвращает false, если значения поля объектов разные")
    public void equalsTrueFive() {
        Student student1 = new Student("Pete");
        student1.addGrade(2);
        Student student2 = new Student("Pete");
        student2.addGrade(3);
        Assertions.assertFalse(student1.equals(student2));
    }

    @Test
    @DisplayName("Геттер и сеттер поля name работают корректно")
    public void getterAndSetterName() {
        Student student = new Student("Pete");
        String newName = "Vanya";
        student.setName(newName);
        Assertions.assertEquals(student.getName(), newName);
    }

    @Test
    @DisplayName("Хэшкоды для объектов с одинаковыми полями name и пустыми оценками равны")
    public void hashCodeEquals() {
        Student student1 = new Student("Pete");
        Student student2 = new Student("Pete");
        Assertions.assertEquals(student1.hashCode(), student2.hashCode());
    }
}