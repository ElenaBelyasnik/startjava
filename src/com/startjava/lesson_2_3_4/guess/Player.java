package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 1;
    private final String name;
    private final int[] numbers = new int[CAPACITY];
    private int attempt;
    private int score;
    private boolean isWinner;

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
        if (number <= 0) {
            throw new RuntimeException("Введённое число должно быть в полуинтервале (0, 100]");
        }
        if (attempt < CAPACITY) {
            numbers[attempt] = number;
            attempt++;
        } else {
            System.out.println("У игрока " + this.name + " закончились попытки");
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

    public int getNumber(int index){
        return numbers[index];
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}