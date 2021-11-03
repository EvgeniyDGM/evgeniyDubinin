package homework5;

import java.util.Objects;

public class RubberDuck extends Birds implements CanSwim {

    String material;
    String beak;

    public RubberDuck(String name, String type, String material, String beak) {
        super(name, type);
        this.material = material;
        this.beak = beak;
    }

    public void fly() {
        System.out.println("RubberDuck can't fly");

    }

    public void iAm() {
        System.out.println("RubberDuck is a bird");

    }

    @Override
    public void swimSklills() {
        System.out.println("The RubberDuck can swim on the water");
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "material='" + material + '\'' +
                ", beak='" + beak + '\'' +
                ", name='" + name + '\'' +
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
