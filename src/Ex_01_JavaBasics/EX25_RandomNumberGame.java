package Ex_01_JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class EX25_RandomNumberGame {
    public static void main(String[] args) {

        // Guess a number between 1 and 100. It will automatically generate the number from 1 to 100
        Random random = new Random();
        int value1 = random.nextInt(101);
        System.out.println("Guessing the Value" + " " + value1);

        // Scanner class we used to take input from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");

        int guess;   // Create a local variable for checking conditions with scanner class
        int attampt = 0;

        while (true) {
            guess = scanner.nextInt();
            attampt++;

            if (guess < value1) {
                System.out.println("Value is too low to guess" + " " + guess );
            } else if (guess > value1) {
                System.out.println("Value is too high to guess" + " " + guess);
            }
            else{
        System.out.println("Guess Value is same as random value" + " " + guess + " " + "attampt" + " " + attampt);
        break;
            }
        }
    }
}
