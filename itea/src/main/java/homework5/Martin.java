package homework5;

public class Martin extends Birds implements CanEat, CanFly {

    String beak;

    public Martin(String name, String type) {
        super(name, type);
    }

    public void fly() {
        System.out.println("Martin can fly");

    }

    public void iAm() {
        System.out.println("Martin is a bird");
    }

    public Double speed(CanFly canFly) {

        double martinFlySpeed = 160.0;

        return martinFlySpeed;
    }


    public Double speed() {

        double martinSurfaceSpeed = 1.0;

        return martinSurfaceSpeed;
    }

    @Override
    public void feed() {
        System.out.println("A martin eats bugs");

    }


    @Override
    public String toString() {
        return "Martin{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
