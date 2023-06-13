package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int CAPACITY = 10;
    private final String name;
    private int[] numbers = new int[CAPACITY];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, getResultsLength());
    }

    public void addNumbers(int number, int index) {
        numbers[index] = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getResultsLength() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public int[] getFullNumbers(){
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}