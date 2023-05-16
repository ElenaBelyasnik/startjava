import java.util.Scanner;

public class Player {
    private static final Scanner console = new Scanner(System.in);
    String name;
    int number;

    public Player() {
        System.out.println("Введите имя игрока: ");
        this.name = console.next();
        this.number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void guessNumber() {
        this.number++;
    }
}