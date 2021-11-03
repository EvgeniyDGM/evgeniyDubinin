package homework5;

public class Test {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck("anyRubberDuckName", "toy", "gum", "like a duck");
        Platypus platypus = new Platypus("anyPlatypusName", "mammal");
        Martin martin = new Martin("anyMartinName", "bird");
        Swan swan = new Swan("anySwanName", "bird");

        rubberDuck.iAm();
        martin.iAm();
        martin.fly();

        swan.feed();
        swan.swimSklills();
        swan.fly();

        System.out.println(martin.speed());

        platypus.swimSklills();

    }
}
