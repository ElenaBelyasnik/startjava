package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private final int arg1;
    private final int arg2;
    private final String sign;

    public Calculator(int arg1, int arg2, String sign) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.sign = sign;
    }

    public double calculate() {
        switch (sign) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return (double) arg1 / arg2;
            case "%":
                return arg1 % arg2;
            case "^":
                int result = arg1;
                for (int i = 0; i < arg2; i++) {
                    result *= arg1;
                }
                return result;
            default:
                System.out.println("Введённая математическая операция не поддерживается");
        }
        return 0;
    }
}