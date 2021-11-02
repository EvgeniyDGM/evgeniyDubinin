package homework4.vehicles;

public class SportCar extends Car {
    private double speed;

    @Override
    public String toString() {
        return "SportCar{" + "speed=" + speed + '}';
    }

    public SportCar() {
        this.speed = getSpeed();
    }

    public SportCar(double speed) {

        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

