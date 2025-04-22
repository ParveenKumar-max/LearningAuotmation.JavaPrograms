package Ex_01_JavaBasics.Ex_58_ExceptionHandling;

import java.util.Scanner;

public class Ex58_08_ExceptionHandlingTHROW1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value");
        int age = scanner.nextInt();
        try {
            validate(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }

    private static void validate(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You can't authorized person to allowed");
        }else {
            System.out.println("You are allowed to Play");
        }


    }
}



