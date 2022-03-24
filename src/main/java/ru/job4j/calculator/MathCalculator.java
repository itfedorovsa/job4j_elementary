package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double substAndDiv(double first, double second) {
        return MathFunction.substract(first, second)
                + MathFunction.division(first, second);
    }

    public static double sumAndMultAndSubstAndDiv(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.substract(first, second)
                + MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + substAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultAndSubstAndDiv(10, 20));
    }
}