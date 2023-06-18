package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int arg1;
    private static int arg2;
    private static String sign;

    public static void initCalculator(String expression) {
        String[] partsExpression = expression.split(" ");
        try {
            arg1 = Integer.parseInt(partsExpression[0]);
            arg2 = Integer.parseInt(partsExpression[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Аргументы должны быть целыми");
        }
        sign = partsExpression[1];
    }

    public static double calculate() {
        if (isPositiveInteger(arg1) && isPositiveInteger(arg2)) {
        switch (sign) {
                case "+" -> {
                    return arg1 + arg2;
                }
                case "-" -> {
                    return arg1 - arg2;
                }
                case "*" -> {
                    return arg1 * arg2;
                }
                case "/" -> {
                    return (double) arg1 / arg2;
                }
                case "%" -> {
                    return arg1 % arg2;
                }
                case "^" -> {
                    return Math.pow(arg1, arg2);
                }
                default ->
                        System.out.println("Введённая математическая операция не поддерживается");
            }
        }
        return 0;
    }

    private static boolean isPositiveInteger(double number) {
        try {
            if (number <= 0) {
                throw new RuntimeException("Аргументы должны быть положительными");
            }
            if (number % 1 != 0) {
                throw new RuntimeException("Аргументы должны быть целыми");
            }
            return true;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}