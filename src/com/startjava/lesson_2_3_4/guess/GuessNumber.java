package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    private static final int MAX_VALUE = 100;
    private final Player player1;
    private final Player player2;
    private boolean isWin;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.isWin = false;
    }

    public void play() {
        player1.clear();
        player2.clear();
        analyzeNumber();
    }

    private void analyzeNumber() {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(MAX_VALUE) + 1;
        Player currentPlayer = player1;
        while (isGameNotOver()) {
            int currentNumber = inputNumber(currentPlayer);
            checkNumber(currentPlayer, secretNumber, currentNumber);
            currentPlayer = changePlayer(currentPlayer);
        }
        printAttempts(player1);
        printAttempts(player2);
        if (!isWin) {
            System.out.println("Никто из игроков не угадал число.");
        }
    }

    private void checkNumber(Player currentPlayer, int secretNumber, int currentNumber) {
        if (currentNumber > secretNumber) {
            System.out.println("Число " + currentNumber
                    + " больше того, что загадал компьютер (" + secretNumber + ")");
        } else if (currentNumber < secretNumber) {
            System.out.println("Число " + currentNumber
                    + " меньше того, что загадал компьютер (" + secretNumber + ")");
        } else {
            isWin = true;
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                    + currentNumber + " c "
                    + currentPlayer.getAttempt() + " попытки");
        }
    }

    private boolean isGameNotOver() {
        return !isWin && (hasAttempt(player1) || hasAttempt(player2));
    }

    private int inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " вводит число: ");
        int number = console.nextInt();
        player.addNumber(number);
        return number;
    }

    public boolean hasAttempt(Player player) {
        boolean isNotOver = player.getAttempt() < Player.CAPACITY;
        if (!isNotOver) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return isNotOver;
    }

    private Player changePlayer(Player player) {
        if (player == player1) {
            return player2;
        }
        return player1;
    }

    public void printAttempts(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");
        int[] numbers = player.getNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}