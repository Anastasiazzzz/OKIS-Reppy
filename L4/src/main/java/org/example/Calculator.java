package org.example;

public class Calculator {

    public static double Sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double Difference(double a, double b) {
        return a - b;
    }

    public static double Multip(double a, double b) {
        return a * b;
    }

    public static double Division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
