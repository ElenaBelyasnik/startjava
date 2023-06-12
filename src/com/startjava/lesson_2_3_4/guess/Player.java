package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int CAPACITY = 10;
    private final String name;
    private int[] numbers = new int[CAPACITY];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        this.attempt = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }


    public boolean isPlayerAttemptNotOver() {
        boolean isNotOver = attempt < numbers.length;
        if (!isNotOver) {
            System.out.println("У " + name + " закончились попытки");
        }
        return isNotOver;
    }

    public void printResults() {
        System.out.print("Числа, названные игроком " + name + ": ");
        int[] results = Arrays.copyOf(numbers, attempt);
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }
}