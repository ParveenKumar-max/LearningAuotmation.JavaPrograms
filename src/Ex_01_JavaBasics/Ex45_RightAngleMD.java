package Ex_01_JavaBasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex45_RightAngleMD {

    public static void main(String[] args) {

        // Print Right Angle

        Scanner scanner_value = new Scanner(System.in);
        System.out.println("Enter the Value MD Right Angle");
        int value = scanner_value.nextInt();

        for (int i = 0; i < value; i++) {
            for (int j = 0; j <= i; j++) {
                //System.out.print(i + " " + "*" + " " + j);
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        System.out.println("Enter the Value MD Reverse");

        int value2 = scanner_value.nextInt();
        for (int i = value2; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
               // System.out.print(i + " " + "*" + " " + j);
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        System.out.println("Enter the Value MD Multiplication");

        int value3 = scanner_value.nextInt();

        for (int i = 0; i <= value3; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        System.out.println("Enter the Value MD for Pyramid");





    }
}
