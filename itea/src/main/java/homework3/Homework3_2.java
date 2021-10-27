package homework3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {

        Scanner inputFromKeyboard = new Scanner(System.in);


        System.out.println("If I drink, I die. If I eat, I am fine. What am I?");

        for (int i = 0, answerTry = 2; i < 3; i++, answerTry--) {
            System.out.print("Your answer: ");
            String answerForQuestion = inputFromKeyboard.nextLine();

            if (answerForQuestion.equalsIgnoreCase("Fire")){
                System.out.println("Great!");
                break;
            }
            else if(answerForQuestion.equalsIgnoreCase("I don't know")) {
                System.out.println("Answer: Fire");
                break;
            }
            else if (answerTry > 0) {
                System.out.println();
                System.out.println("Think again!");
                System.out.println("(Left tries/try: " + answerTry + ")");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("The answer is not correct! You used all trying! Try again please!");

            }
        }
    }
}
