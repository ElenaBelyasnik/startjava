import java.util.Scanner;

public class Player {
    private static final Scanner console = new Scanner(System.in);
    private final String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void inputNumber() {
        System.out.println("Игрок " + this.name + " вводит число: ");
        this.number = console.nextInt();
    }
}