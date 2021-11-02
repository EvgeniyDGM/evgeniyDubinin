package homework4.vehicles;

import homework4.details.Engine;
import homework4.professions.Driver;

public class Car {
    private String brand;
    private String type;
    private int weight;
    Driver driver;
    Engine engine;


    public Car(String brand, String type, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

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
