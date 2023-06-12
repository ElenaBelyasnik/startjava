package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    private static final int MAX_VALUE = 100;
    private final Player player1;
    private final Player player2;
    private final int secretNumber = (int) (Math.random() * MAX_VALUE + 1);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        player1.clear();
        player2.clear();
        Player currentPlayer = player1;
        boolean isWin = false;
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
        player1.printResults();
        player2.printResults();
    }

    private void inputNumber(Player player, int attempt) {
        int[] numbers = player.getNumbers();
        System.out.println("Игрок " + player.getName() + " вводит число: ");
        numbers[attempt] = console.nextInt();
        player.setNumbers(numbers);
        player.setAttempt(++attempt);
    }

    private Player changePlayer(Player player) {
        if (player == player1 && player2.isPlayerAttemptNotOver()) {
            return player2;
        } else if (player == player2 && player1.isPlayerAttemptNotOver()) {
            return player1;
        } else if (player.isPlayerAttemptNotOver()) {
            return player;
        }
        return null;
    }
}