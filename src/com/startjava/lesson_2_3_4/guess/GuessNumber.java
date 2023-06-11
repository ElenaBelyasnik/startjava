package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    private static final int MAX_VALUE = 10;
    private final Player player1;
    private final Player player2;
    private final int secretNumber = (int) (Math.random() * MAX_VALUE + 1);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player currentPlayer = player1;
        boolean isWin = false;
        while (!isWin) {
            if (currentPlayer != null) {
                System.out.println("Числа, введённые игроком " + currentPlayer.getName() + " "
                        + Arrays.toString(currentPlayer.getNumbers()));
                currentPlayer.inputNumber();
                if (currentPlayer.getNumber() > secretNumber) {
                    System.out.println("Число " + currentPlayer.getNumber()
                            + " больше того, что загадал компьютер (" + secretNumber + ")");
                    currentPlayer = changePlayer(currentPlayer);
                } else if (currentPlayer.getNumber() < secretNumber) {
                    System.out.println("Число " + currentPlayer.getNumber()
                            + " меньше того, что загадал компьютер (" + secretNumber + ")");
                    currentPlayer = changePlayer(currentPlayer);
                } else {
                    isWin = true;
                    System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                            + currentPlayer.getNumber() + " c "
                            + currentPlayer.getPlayerTryNumber() + " попытки");
                }
            } else {
                break;
            }
        }
        player1.saveResults();
        player2.saveResults();
        if (!isWin) {
            System.out.println("Никто из игроков не угадал число.");
        }
    }

    private Player changePlayer(Player player) {
        if (player == player1 && player2.isPlayerValid()) {
            return player2;
        } else if (player == player2 && player1.isPlayerValid()) {
            return player1;
        } else if (player.isPlayerValid()) {
            return player;
        }
        return null;
    }
}