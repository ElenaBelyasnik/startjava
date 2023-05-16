import java.util.Scanner;

public class GuessNumberTest {
    private static final Scanner console = new Scanner(System.in);
    public static final Player player1 = new Player();
    public static final Player player2 = new Player();

    public static void main(String[] args) {
        Player player = player1;
        do {
            System.out.println("Играет " + player.getName());
            GuessNumber guessNumber = new GuessNumber(player);
            guessNumber.play();
            player = changePlayer(player);
        } while (isNext());
    }

    private static boolean isNext() {
        String option;
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            option = console.next();
        } while (!option.equals("yes") && !option.equals("no"));
        return option.equals("yes");
    }

    private static Player changePlayer(Player player) {
        if (player.equals(player1)) {
            return player2;
        } else {
            return player1;
        }
    }
}
