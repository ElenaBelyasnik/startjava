package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 10;
    private final String name;
    private final int[] numbers = new int[CAPACITY];
    private int attempt;
    private int score;
    private boolean isWinner = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void addNumber(int number) {
        RuntimeException checkNumber =
                new RuntimeException("Введённое число должно быть в полуинтервале (0, 100]");
        if (number > 0 && number <= GuessNumber.MAX_VALUE) {
            if (attempt < CAPACITY) {
                numbers[attempt] = number;
                attempt++;
            } else {
                System.out.println("У игрока " + this.name + " закончились попытки");
            }
        } else {
            throw checkNumber;
        }
    }

    public int getAttempt() {
        return attempt;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}