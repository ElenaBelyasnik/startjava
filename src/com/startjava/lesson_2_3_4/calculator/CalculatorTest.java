package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Калькулятор запущен!");
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите математическое выражение: ");
                String expression = console.nextLine();
                Calculator.initCalculator(expression);
                showResult(Calculator.calculate());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = console.nextLine();
        } while (!"no".equals(answer));
        System.out.println("Калькулятор закрылся.");
    }

    private static void showResult(double result) {
        String stringFormat = (result % 1 == 0) ? "%.0f\n" : "%.3f\n";
        System.out.printf("Результат: " + stringFormat, result);
    }
}