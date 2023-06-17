package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static double arg1;
    private static double arg2;
    private static String sign;

    public static void initCalculator(String expression) {
        String[] partsExpression = expression.split(" ");

        arg1 = Double.parseDouble(partsExpression[0]);
        arg2 = Double.parseDouble(partsExpression[2]);
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
                    return arg1 / arg2;
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

    private static boolean isPositiveInteger(Double number) {
        try {
            if (number <= 0) {
                throw new RuntimeException("Аргументы должны быть положительными");
            } else if (number % 1 != 0) {
                throw new RuntimeException("Аргументы должны быть целыми");
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}