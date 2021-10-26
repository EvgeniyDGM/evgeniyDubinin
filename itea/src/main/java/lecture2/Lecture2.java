package lecture2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Lecture2 {

    public static void main(String[] args) {
        String text = "This is a text";
        char symbol = text.charAt(0);

        System.out.println(symbol);

        int point = text.codePointAt(0);
        int pointBefore = text.codePointBefore(1);

        System.out.println("Point: " + point);
        System.out.println("PointBerore: " + pointBefore);

        String name = "Vasya  ";
        String fullName = "Vasya Pupkin";

        boolean isFullNameContainsName = fullName.contains(name);
        System.out.println(isFullNameContainsName);


        // Замена
        String newName = name.replace("ya", "iliy");
        System.out.println(newName);
        String nameWithOutSpaces = name.trim();
        System.out.println(nameWithOutSpaces);


        // Вывод символов строки
        String nameSubstring1 = name.substring(1);
        String nameSubstring2 = name.substring(1, 3);

        System.out.println(nameSubstring1);
        System.out.println(nameSubstring2);

        //Соответсвие
        boolean nameStartsWith = name.startsWith("V");
        boolean nameEndsWith = name.endsWith("n");

        System.out.println(nameStartsWith);
        System.out.println(nameEndsWith);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //Приведение к другому типу
        int ab =1;
        String intAB = String.valueOf(ab);
        System.out.println(intAB);



        //Math
        int result = Math.abs(-344);
        System.out.println(result);

        int maxSymbol = Math.max(2, 5);
        int minSymbol = Math.min(4, 6);

        System.out.println(maxSymbol);
        System.out.println(minSymbol);

        double numberDouble = Math.round(12.478);
        System.out.println(numberDouble);







        //Ввод данных с клавиатуры
        System.out.println("input int: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        System.out.println("You inputed the number " + number);
        String number11 = scan.nextLine();
        System.out.println(number11);

        System.out.println("Input double symbol:");
        Double number12 = scan.nextDouble();
        System.out.println(number12);

        System.out.println("Input boolean text:");
        boolean number13 = scan.nextBoolean();
        System.out.println(number13);



    }

}
