package com.startjava.lesson_2_3_4.calculator;

import java.util.Objects;

public class Calculator {
    private final int arg1;
    private final int arg2;
    private final String sign;

    public Calculator(String expression) {
        String[] args = expression.split(" ");
        this.arg1 = Integer.parseInt(args[0]);
        this.arg2 = Integer.parseInt(args[2]);
        this.sign = args[1];
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