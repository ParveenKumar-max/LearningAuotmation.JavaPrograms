package Ex_01_JavaBasics;

import java.util.Scanner;

public class Ex21_SwitchConditions {
    public static void main(String[] args) {
        // Switch -- Conditions statement
        int age = 25;
        switch (age){
            case 10:
                System.out.println("Value won't Print");
                break;
            case 25:
                System.out.println("Yes, it will print");
                break;
            default:
                System.out.println("Value Not available");
                break;
        }
        System.out.println("Switch statement executed");

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();

        switch (value1){
            case 1:
                System.out.println("It's Monday Today");
                break;
            case 2:
                System.out.println("It's Tuesday Today");
                break;
            default:
                System.out.println("Holiday");
                break;
        }
        System.out.println("Taking value from input done");





    }
}
