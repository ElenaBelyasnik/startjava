import java.util.Scanner;

public class GuessNumber {
    private static final Scanner console = new Scanner(System.in);
    private final Player player1;
    private final Player player2;
    private final int randomComputerNumber = (int) (Math.random() * 10 + 1);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player currentPlayer = player1;
        boolean isWin = false;
        do {
            currentPlayer.inputNumber();
            if (currentPlayer.getNumber() > randomComputerNumber) {
                System.out.println("Число " + currentPlayer.getNumber()
                        + " больше того, что загадал компьютер (" + randomComputerNumber + ")");
                currentPlayer = changePlayer(currentPlayer);
            } else if (currentPlayer.getNumber() < randomComputerNumber) {
                System.out.println("Число " + currentPlayer.getNumber()
                        + " меньше того, что загадал компьютер (" + randomComputerNumber + ")");
                currentPlayer = changePlayer(currentPlayer);
            } else {
                isWin = true;
                System.out.println(currentPlayer.getName() + " победил!");
            }
        } while (!isWin);
    }

    private Player changePlayer(Player player) {
        if (player == player1) {
            return player2;
        }
        return player1;
    }
}