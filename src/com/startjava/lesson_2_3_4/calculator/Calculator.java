package com.startjava.lesson_2_3_4.calculator;

import java.util.Objects;

public class Calculator {
    private final int arg1;
    private final int arg2;
    private final String sign;

    public Calculator(int arg1, int arg2, String sign) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.sign = sign;
    }

    public Calculator(String[] expressionParts) {
        this.arg1 = Integer.parseInt(expressionParts[0]);
        this.sign = expressionParts[1];
        this.arg2 = Integer.parseInt(expressionParts[2]);
    }

    public double calculate() {
        switch (sign) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return Math.multiplyExact(arg1, arg2);
            case "/":
                return Math.floorDiv(arg1, arg2);
            case "%":
                return arg1 % arg2;
            case "^":
                return Math.pow(arg1, arg2);
            default:
                System.out.println("Введённая математическая операция не поддерживается");
        }
        return 0;
    }
}