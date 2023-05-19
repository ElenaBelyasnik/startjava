import java.util.Scanner;

public class GuessNumberTest {
    private static final Scanner console = new Scanner(System.in);
    private static final Player player1 = initPlayer();
    private static final Player player2 = initPlayer();

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.play();
    }

    private static Player initPlayer() {
        System.out.println("Введите имя игрока: ");
        String name = console.next();
        return new Player(name);
    }
}