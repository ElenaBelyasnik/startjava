public class MyFirstGame {

    public static void main(String[] args) {
        int randomNumber = 1;
        int playerNumber = 1;

        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            playerNumber++;
            if (playerNumber > 100) {
                playerNumber = 1;
            }
            if (playerNumber > randomNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            } else if (playerNumber < randomNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            }
        } while (randomNumber != playerNumber);
        System.out.println("Вы победили!");
    }
}
