import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    private final Player player1;
    private final Player player2;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player player = player1;
        do {
            System.out.println("Играет " + player.getName());
            guessNumber(player);
            player = changePlayer(player);
        } while (isNext());
    }

    public void guessNumber(Player player) {
        int randomNumber;
        boolean isWin;
        do {
            isWin = false;
            randomNumber = (int) (Math.random() * 10 + 1);
            player.guessNumber();
            if (player.getNumber() > 10) {
                player.setNumber(1);
            }
            if (player.getNumber() > randomNumber) {
                System.out.println("Число " + player.getNumber()
                        + " больше того, что загадал компьютер (" + randomNumber + ")");
            } else if (player.getNumber() < randomNumber) {
                System.out.println("Число " + player.getNumber()
                        + " меньше того, что загадал компьютер (" + randomNumber + ")");
            } else {
                isWin = true;
                System.out.println(player.getName() + " победил!");
            }
        } while (isWin);
    }

    private Player changePlayer(Player player) {
        if (player.equals(player1)) {
            return player2;
        } else {
            return player1;
        }
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