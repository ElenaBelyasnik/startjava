package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("У каждого игрока по 10 попыток");
        Player player1 = initPlayer();
        Player player2 = initPlayer();
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                player1.restart();
                player2.restart();
                GuessNumber guessNumber = new GuessNumber(player1, player2);
                guessNumber.play();
                player1.printResults();
                player2.printResults();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = console.nextLine();
        } while (!"no".equals(answer));
    }

    private static Player initPlayer() {
        System.out.println("Введите имя игрока: ");
        String name = console.nextLine();
        return new Player(name);
    }
}