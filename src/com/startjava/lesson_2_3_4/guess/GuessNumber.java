package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    private static final int MAX_VALUE = 100;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        player1.clear();
        player2.clear();
        Player currentPlayer = player1;
        boolean isWin = false;
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(100);
        while (!isWin) {
            if (currentPlayer != null) {
                System.out.println("Числа, введённые игроком " + currentPlayer.getName() + " "
                        + Arrays.toString(currentPlayer.getNumbers()));
                int attempt = currentPlayer.getAttempt();
                inputNumber(currentPlayer, attempt);
                int currentNumber = currentPlayer.getNumbers()[attempt];
                if (currentNumber > secretNumber) {
                    System.out.println("Число " + currentNumber
                            + " больше того, что загадал компьютер (" + secretNumber + ")");
                    currentPlayer = changePlayer(currentPlayer);
                } else if (currentNumber < secretNumber) {
                    System.out.println("Число " + currentNumber
                            + " меньше того, что загадал компьютер (" + secretNumber + ")");
                    currentPlayer = changePlayer(currentPlayer);
                } else {
                    isWin = true;
                    System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                            + currentNumber + " c "
                            + currentPlayer.getAttempt() + " попытки");
                }

            } else {
                break;
            }
        }
        if (!isWin) {
            System.out.println("Никто из игроков не угадал число.");
        }
        printResults(player1);
        printResults(player2);
    }

    private void inputNumber(Player player, int attempt) {
        System.out.println("Игрок " + player.getName() + " вводит число: ");
        int number = console.nextInt();
        int index = player.getResultsLength();
        player.addNumbers(number, index);
        player.setAttempt(++attempt);
    }

    public boolean isPlayerAttemptNotOver(Player player) {
        boolean isNotOver = player.getAttempt() < player.getFullNumbers().length;
        if (!isNotOver) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return isNotOver;
    }

    private Player changePlayer(Player player) {
        if (player == player1 && isPlayerAttemptNotOver(player2)) {
            return player2;
        } else if (player == player2 && isPlayerAttemptNotOver(player1)) {
            return player1;
        } else if (isPlayerAttemptNotOver(player)) {
            return player;
        }
        return null;
    }

    public void printResults(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");
        int[] results = player.getNumbers();
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }
}