package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private static final Scanner console = new Scanner(System.in);
    private static final int TOTAL_TRY_NUMBER = 10;
    private final String name;
    private int[] numbers = new int[TOTAL_TRY_NUMBER];
    private int[] results;
    private int number;
    private int playerTryNumber;

    public Player(String name) {
        this.name = name;
    }

    public void restart() {
        Arrays.fill(this.numbers, 0);
        this.playerTryNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getNumber() {
        return number;
    }

    public int getPlayerTryNumber() {
        return playerTryNumber;
    }

    public int[] getResults() {
        return results;
    }

    public void inputNumber() {
            System.out.println("Игрок " + this.name + " вводит число: ");
            this.number = console.nextInt();
            this.numbers[this.playerTryNumber] = this.number;
            this.playerTryNumber++;
    }

    public boolean isPlayerValid() {
        return playerTryNumber < numbers.length;
    }

    public void saveResults() {
        results = Arrays.copyOf(numbers, playerTryNumber);
    }

    public void printResults(){
        System.out.print("Числа, названные игроком " + name + ": ");
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }
}