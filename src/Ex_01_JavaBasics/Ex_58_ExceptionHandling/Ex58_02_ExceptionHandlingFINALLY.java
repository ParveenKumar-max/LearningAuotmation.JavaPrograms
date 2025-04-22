package Ex_01_JavaBasics.Ex_58_ExceptionHandling;

import java.util.Scanner;

public class Ex58_02_ExceptionHandlingFINALLY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        //int value = scanner.nextInt();
        try {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                System.out.println("Value is Even");
            } else {
                System.out.println("Value is Odd");
            }
        } catch (Exception e) { //"main" java.util.InputMismatchException
            System.out.println("Unacceptable Value");
        }finally {
            System.out.println("Thank You !");
            scanner.close();
        }
    }
}
