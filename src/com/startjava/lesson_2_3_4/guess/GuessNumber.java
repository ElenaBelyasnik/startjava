package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    public static final int MAX_VALUE = 100;
    public static final int MAX_ROUNDS = 3;
    private final Player[] players;
    private boolean isWin;
    private int rounds;

    public GuessNumber(Player... players) {
        this.players = players;
        this.isWin = false;
        this.rounds = 0;
    }

    public void play() {
        rounds = 0;
        drawLots();
        clearWinner();
        while (rounds < MAX_ROUNDS) {
            rounds++;
            isWin = false;
            System.out.println("РАУНД " + rounds);
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
            int j;
            j = rnd.nextInt(i + 1);
            Player tempPlayer = players[i];
            players[i] = players[j];
            players[j] = tempPlayer;
        }
    }

    private void analyzeNumber() {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(MAX_VALUE) + 1;
        Player currentPlayer = players[0];
        while (isGameNotOver()) {
            int currentNumber = inputNumber(currentPlayer);
            checkNumber(currentPlayer, secretNumber, currentNumber);
            currentPlayer = changePlayer(currentPlayer);
        }
        if (!isWin) {
            System.out.println("Никто из игроков не угадал число.");
        }
    }

    private void checkNumber(Player currentPlayer, int secretNumber, int currentNumber) {
        String message = (currentNumber > secretNumber) ? " больше"
                : (currentNumber < secretNumber) ? " меньше" : "";
        isWin = currentNumber == secretNumber;
        if (isWin) {
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                    + currentNumber + " c "
                    + currentPlayer.getAttempt() + " попытки");

            int score = currentPlayer.getScore();
            currentPlayer.setScore(++score);
        } else {
            System.out.println("Число " + currentNumber
                    + message + " того, что загадал компьютер (" + secretNumber + ")");
        }
    }

    private boolean isGameNotOver() {
        boolean hasAttempt = false;
        for (Player player : players) {
            if (hasAttempt(player)) {
                hasAttempt = true;
                break;
            }
        }
        return !isWin && hasAttempt;
    }

    private int inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " вводит число: ");
        int number = console.nextInt();
        if (number > 0 && number <= 100) {
            player.addNumber(number);
        } else {
            System.out.println("Введённое число должно быть в полуинтервале (0, 100]");
            number = inputNumber(player);
        }
        return number;
    }

    public boolean hasAttempt(Player player) {
//        boolean isNotOver = player.getAttempt() < Player.CAPACITY;
//        if (!isNotOver) {
//            System.out.println("У " + player.getName() + " закончились попытки");
//        }
        return player.getAttempt() < Player.CAPACITY;
    }

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

    private void showWinner() {
        System.out.print("\nПобедители по итогу 3-х раундов: ");
        for (Player player : players) {
            if (player.isWinner()) {
                System.out.print(player.getName() + " ");
            }
        }
        System.out.println();
    }

    private void clearWinner() {
        for (Player player : players) {
            player.setScore(0);
            player.setWinner(false);
        }
    }

}