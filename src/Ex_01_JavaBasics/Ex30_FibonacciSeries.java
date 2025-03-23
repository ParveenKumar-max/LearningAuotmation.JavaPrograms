package Ex_01_JavaBasics;

import java.util.Scanner;

public class Ex30_FibonacciSeries {
    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21 34 55

        // Create a scanner class for USER INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value......");

        // Ask user to enter the value
        int value = scanner.nextInt();

        // Create two variables to store first two terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series::::....");

        // Print the fibonacci Series

        for (int i = 1; i <= value; i++) {
            System.out.print(first + " ");

            //Calculate the Next Term
            int next = first + second;
            first = second;
            second = next;

        }
        scanner.close();


    }
}
