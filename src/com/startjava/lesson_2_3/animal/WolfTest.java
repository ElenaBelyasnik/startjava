public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setMale(true);
        wolf.setName("Акелла");
        wolf.setWeight(30.0f);
        wolf.setAge(6);
        wolf.setColor("серый");
        System.out.println("male = " + wolf.isMale());
        System.out.println("name = " + wolf.getName());
        System.out.println("weight = " + wolf.getWeight());
        System.out.println("age = " + wolf.getAge());
        System.out.println("color = " + wolf.getColor());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
