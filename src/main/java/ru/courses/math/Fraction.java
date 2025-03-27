package ru.courses.math;

import java.util.Objects;

public class Fraction implements Cloneable {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Знаменатель не может быть 0");
        if (denominator < 0) {
            denominator *= -1;
            numerator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fraction) {
        int nok = nok(denominator, fraction.denominator);
        int factor1 = nok / denominator;
        int factor2 = nok / fraction.denominator;

        return fractionBeautify(numerator * factor1 + fraction.numerator * factor2, nok);
    }

    public Fraction sum(int n) {
        return fractionBeautify(numerator + denominator * n, denominator);
    }

    public Fraction minus(Fraction fraction) {
        int nok = nok(denominator, fraction.denominator);
        int factor1 = nok / denominator;
        int factor2 = nok / fraction.denominator;

        return fractionBeautify(numerator * factor1 - fraction.numerator * factor2, nok);
    }

    public Fraction minus(int n) {
        return fractionBeautify(numerator - denominator * n, denominator);
    }

    private int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    private int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    @Override
    public String toString() {
        return String.format("%s/%s", numerator, denominator);
    }

    private Fraction fractionBeautify(int numerator, int denominator) {
        int nod = nod(numerator, denominator);

        return new Fraction(numerator / nod, denominator / nod);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    public boolean equalsAfterBeautify(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction thisBeautified = fractionBeautify(numerator, denominator);
        Fraction oBeautified = fractionBeautify(((Fraction) o).numerator, ((Fraction) o).denominator);
        return thisBeautified.numerator == oBeautified.numerator && thisBeautified.denominator == oBeautified.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public Fraction clone() throws CloneNotSupportedException {
        return (Fraction) super.clone();
    }
}