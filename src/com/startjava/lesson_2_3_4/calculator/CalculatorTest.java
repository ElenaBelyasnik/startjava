package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.println("У каждого игрока по 10 попыток");
        do {
            Calculator calculator = initiate();
            System.out.println("Результат: " + calculator.calculate());
        } while (isNext());
    }

    private static Calculator initiate() {
        System.out.println("Введите математическое выражение: ");
        String expressionString = console.nextLine();
        String[] expressionParts = expressionString.split(" ");
        return new Calculator(expressionParts);
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