package homework4.vehicles;

public class Truck extends Car{
    private int carrying;

    @Override
    public String toString() {
        return "Truck{" + "carrying=" + carrying + '}';
    }

    public Truck() {
        this.carrying = getCarrying();
    }

    public Truck(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
