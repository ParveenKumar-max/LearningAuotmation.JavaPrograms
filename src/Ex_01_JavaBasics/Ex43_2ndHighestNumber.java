package Ex_01_JavaBasics;

import java.util.Arrays;

public class Ex43_2ndHighestNumber {

    public static void main(String[] args) {

        // Two ways to find the highest or Max number

        int[] value1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.sort(value1);
        System.out.println(value1[value1.length - 2]);


        int found_2nd_highest_number = give_me_2nd_highest(value1);
        System.out.println(found_2nd_highest_number);
        System.out.println(value1[value1.length-2]);

    }

    private static int give_me_2nd_highest(int[] value1) {

        int value_2nd_highest = value1[0];
        for (int i = 0; i < value1.length; i++) {
            if (value1[i] > value_2nd_highest) {
                value_2nd_highest = value1[i];
            }

        }
        return value_2nd_highest;
    }
}
