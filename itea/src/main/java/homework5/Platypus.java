package homework5;

import java.util.Objects;

public class Platypus implements CanSwim, CanEat {
    String name;
    String type;

    public Platypus(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void feed() {
        System.out.println("Platypus eats bugs");
    }

    @Override
    public void swimSklills() {
        System.out.println("Platypus can swim under the water and on the water");
    }

    @Override
    public String toString() {
        return "Platypus{" +
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
