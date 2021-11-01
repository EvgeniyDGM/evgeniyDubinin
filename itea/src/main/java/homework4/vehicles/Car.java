package homework4.vehicles;

import homework4.details.Engine;
import homework4.professions.Driver;

public class Car {
    public String brand = "34";
    public String type = "adsf";
    public int weight = 324;
    Driver driver;
    Engine engine;

    public void start() {
        System.out.println("Let's drive");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    public void printInfo() {
        System.out.println(this.brand);
        System.out.println(this.type);
        System.out.println(this.weight);
        System.out.println(this.driver);
        System.out.println(this.engine);
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", type='" + type + '\'' + ", weight=" + weight + ", driver=" + driver + ", engine=" + engine + '}';
    }
}
