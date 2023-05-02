public class MyFirstGame {

    public static void main(String[] args) {
        int randomNumber = 1;
        int userNumber = 1;

        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            userNumber += 1;
            if (userNumber > randomNumber) {
                System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
            } else if (userNumber < randomNumber) {
                System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
            }
        } while (randomNumber != userNumber);
    }
}
