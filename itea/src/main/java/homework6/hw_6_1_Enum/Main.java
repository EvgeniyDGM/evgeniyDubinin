package homework6.hw_6_1_Enum;

import homework6.hw_6_1_Enum.DaysOfWeek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(DaysOfWeek.values()));


        int fridayIndex = DaysOfWeek.FRIDAY.ordinal();
        System.out.println(fridayIndex);
        System.out.println(DaysOfWeek.FRIDAY);
        System.out.println(DaysOfWeek.FRIDAY.getDayOfWeek());



    }




}
