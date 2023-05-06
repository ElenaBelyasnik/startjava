public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.male = true;
        wolf.name = "Акелла";
        wolf.weight = 30.0f;
        wolf.age = 10;
        wolf.color = "серый";
        System.out.println("male = " + wolf.male);
        System.out.println("name = " + wolf.name);
        System.out.println("weight = " + wolf.weight);
        System.out.println("age = " + wolf.age);
        System.out.println("color = " + wolf.color);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
