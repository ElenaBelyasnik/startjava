public class MyFirstGame {

    public static void main(String[] args) {
        int randomNumber = 1;
        int userNumber = 1;

        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            userNumber += 1;
            if (userNumber > randomNumber) {
                System.out.println("����� " + userNumber + " ������ ����, ��� ������� ���������");
            } else if (userNumber < randomNumber) {
                System.out.println("����� " + userNumber + " ������ ����, ��� ������� ���������");
            } else {
                System.out.println("�� ��������!");
            }
        } while (randomNumber != userNumber);
    }
}
