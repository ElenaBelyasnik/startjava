package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        do {
            Calculator calculator = initiate();
            System.out.println("Результат: " + calculator.calculate());
        } while (isNext());
    }

    private static Calculator initiate() {
        System.out.println("Введите первое число: ");
        int arg1 = console.nextInt();
        System.out.println("Введите знак математической операции: ");
        String sign = console.next();
        System.out.println("Введите второе число: ");
        int arg2 = console.nextInt();
        return new Calculator(arg1, arg2, sign);
    }

    private static boolean isNext() {
        String option;
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.next();
        } while (!option.equals("yes") && !option.equals("no"));
        return option.equals("yes");
    }
}