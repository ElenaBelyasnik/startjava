package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private final int arg1;
    private final int arg2;
    private final String sign;

    public Calculator(String expression) {
        String[] partsExpression = expression.split(" ");
        this.arg1 = Integer.parseInt(partsExpression[0]);
        this.arg2 = Integer.parseInt(partsExpression[2]);
        this.sign = partsExpression[1];
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