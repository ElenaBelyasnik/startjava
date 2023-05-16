public class GuessNumber {
    Player player;

    public GuessNumber(Player player) {
        this.player = player;
    }

    public void play() {
        int randomNumber;
        boolean isWin;
        do {
            isWin = false;
            randomNumber = (int) (Math.random() * 100 + 1);
            player.guessNumber();
            if (player.getNumber() > 100) {
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
}