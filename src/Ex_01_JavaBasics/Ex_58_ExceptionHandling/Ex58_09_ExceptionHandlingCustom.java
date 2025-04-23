package Ex_01_JavaBasics.Ex_58_ExceptionHandling;

import java.util.Scanner;

public class Ex58_09_ExceptionHandlingCustom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age");

        try {
            int value1 = scanner.nextInt();
            validateAge(value1); // Call a method that may throw the exception
        } catch (CustomException e) { // Use the Custom Exception
            System.out.println("Caught Exception: " + e.getMessage());
        }finally {
            System.out.println("Thank you for confirming your age!");
            scanner.close();
        }
    }

    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above."); // Throw the custom exception
        }else {
            System.out.println("Age is above 18, You can access the link.");
        }
    }
}

    // Define a custom exception
    class CustomException extends Exception {
        public CustomException(String message) {
            super(message); // Pass the error message to the parent class
        }
    }

