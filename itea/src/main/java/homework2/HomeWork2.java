package homework2;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner inputFromKeyboard = new Scanner(System.in);

        System.out.print("input the height: ");
        int height = inputFromKeyboard.nextInt();

        System.out.print("input the counts: ");
        int counts = inputFromKeyboard.nextInt();

        System.out.println("The height building " + height + " m and " + counts + " floor/s");


    }
}
