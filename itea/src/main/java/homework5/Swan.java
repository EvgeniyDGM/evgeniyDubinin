package homework5;

public class Swan extends Birds implements CanEat, CanSwim {

    public Swan(String name, String type) {
        super(name, type);
    }

    public void fly() {
        System.out.println("A Swan can fly");
    }

    public void iAm() {
        System.out.println("A Swan is a bird");

    }

    @Override
    public void feed() {
        System.out.println("A Swan eats bread and grass");
    }

    @Override
    public void swimSklills() {
        System.out.println("A Swan can swim on the water");

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
