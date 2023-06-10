package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор запущен!");
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите математическое выражение: ");
                String expression = console.nextLine();
                Calculator calculator = new Calculator(expression);
                System.out.println("Результат: " + calculator.calculate());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = console.nextLine();
        } while (!"no".equals(answer));
        System.out.println("Калькулятор закрылся.");
    }
}