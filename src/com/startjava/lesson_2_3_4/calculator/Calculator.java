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
            sign = partsExpression[1];
        } catch (NumberFormatException e) {
            throw new RuntimeException("Аргументы должны быть целыми");
        }
    }

    public static double calculate() {
        if (isPositive(arg1) && isPositive(arg2)) {
            return switch (sign) {
                case "+" -> arg1 + arg2;
                case "-" -> arg1 - arg2;
                case "*" -> arg1 * arg2;
                case "/" -> (double) arg1 / arg2;
                case "%" -> arg1 % arg2;
                case "^" -> Math.pow(arg1, arg2);
                default -> switchDefault();
            };
        }
        return 0;
    }

    private static double switchDefault() {
        System.out.println("Введённая математическая операция не поддерживается");
        return 0;
    }

    private static boolean isPositive(double number) {
        try {
            if (number <= 0) {
                throw new RuntimeException("Аргументы должны быть положительными");
            }
            return true;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}