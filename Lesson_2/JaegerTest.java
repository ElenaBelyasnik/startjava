public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Crimson Typhoon");
        jaegerOne.setMark("Mark-4");
        jaegerOne.setOrigin("China");
        jaegerOne.setHeight(76.2f);
        jaegerOne.setWeight(1.722f);
        jaegerOne.setSpeed(9);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA",
                79.25f, 1.98f, 7, 8, 6);

        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();

        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
    }
}