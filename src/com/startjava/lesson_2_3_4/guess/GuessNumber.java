package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    public static final int MAX_VALUE = 100;
    private static final int MAX_ROUNDS = 3;
    private final Player[] players;
    private boolean isWin;
    private boolean hasWinner;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void play() {
        drawLots();
        clearWinner();
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            isWin = false;
            System.out.println("РАУНД " + i);
            for (Player player : players) {
                player.clear();
            }
            analyzeNumber();
        }
        findWinner();
        showWinner();
    }

    private void drawLots() {
        Random rnd = new Random();
        int length = players.length;
        for (int i = length - 1; i >= 0; i--) {
            int randomIndex = rnd.nextInt(i + 1);
            Player tempPlayer = players[i];
            players[i] = players[randomIndex];
            players[randomIndex] = tempPlayer;
        }
    }

    private void analyzeNumber() {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(MAX_VALUE) + 1;
        System.out.println("Число, которое загадал компьютер: " + secretNumber);
        while (isGameNotOver()) {
            for (Player player : players) {
                inputNumber(player);
                checkNumber(player, secretNumber);
                if (!isGameNotOver()) {
                    break;
                }
            }
        }
    }

    private void checkNumber(Player currentPlayer, int secretNumber) {
        int currentIndex = currentPlayer.getAttempt() - 1;
        int currentNumber = currentPlayer.getNumbers()[currentIndex];
        isWin = currentNumber == secretNumber;
        if (isWin) {
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                    + currentNumber + " c "
                    + currentPlayer.getAttempt() + " попытки");
            int score = currentPlayer.getScore();
            currentPlayer.setScore(++score);
            hasWinner = true;
        } else {
            String message = currentNumber > secretNumber ? " больше" : " меньше";
            System.out.println("Число " + currentNumber
                    + message + " того, что загадал компьютер (" + secretNumber + ")");
        }
    }

    private boolean isGameNotOver() {
        return !isWin && hasAttempt(players[players.length - 1]);
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " вводит число: ");
        int number = console.nextInt();
        try {
            player.addNumber(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            inputNumber(player);
        }
    }

    public boolean hasAttempt(Player player) {
        return player.getAttempt() < Player.CAPACITY;
    }

/*
    private Player changePlayer(Player player) {
        int length = players.length;
        for (int i = 0; i < length; i++) {
            if (player == players[i]) {
                if (i == (length - 1)) {
                    return players[0];
                }
                return players[i + 1];
            }
        }
        return players[length - 1];
    }
*/

    public void printAttempts(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");
        int[] numbers = player.getNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void findWinner() {
        int maxScore = 0;
        if (isWin) {
            for (Player player : players) {
                int playerScore = player.getScore();
                if (maxScore < playerScore) {
                    maxScore = playerScore;
                }
            }
            for (Player player : players) {
                if (player.getScore() == maxScore) {
                    player.setWinner(true);
                }
            }
        }
    }

    private void showWinner() {
        if (hasWinner) {
            System.out.print("\nПобедители по итогу 3-х раундов: ");
            for (Player player : players) {
                if (player.isWinner()) {
                    System.out.print(player.getName() + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Никто из игроков не угадал число ни в одном из  раундов.");
        }
    }

    private void clearWinner() {
        hasWinner = false;
        for (Player player : players) {
            player.setScore(0);
            player.setWinner(false);
        }
    }
}