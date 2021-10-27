package homework3;

import java.util.Random;

public class Homework3_1 {
    public static void main(String[] args) {

        int[] array = {15, 8, 24, 41, 9, 84};

        Random random = new Random();
        int index = random.nextInt(array.length);
        int randomNumberFromArray = array[index];

        // To get a random number from the array you can use this code as well:
        /*int index = (int)Math.floor(Math.random() * array.length);
        System.out.println(array[index]);*/

        System.out.println("Your number is " + randomNumberFromArray);

        if (randomNumberFromArray % 2 == 0) {
            System.out.println("I am lucky");
        }
        else {
            System.out.println("Run again");
        }
    }
}
