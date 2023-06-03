package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = initPlayer();
        Player player2 = initPlayer();
        do {
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.play();
        } while (isNext());
    }

    private static Player initPlayer() {
        System.out.println("Введите имя игрока: ");
        String name = console.next();
        return new Player(name);
    }

    private static boolean isNext() {
        String option;
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            option = console.next();
        } while (!option.equals("yes") && !option.equals("no"));
        return option.equals("yes");
    }
}