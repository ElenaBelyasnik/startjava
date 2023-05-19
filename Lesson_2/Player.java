import java.util.Scanner;

public class Player {
    private final String name;
    private int number;

    public Player(String name) {
        this.name = name;
        this.number = 0;
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

    public void guessNumber() {
        this.number++;
    }
}