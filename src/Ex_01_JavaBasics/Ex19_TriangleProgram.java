package Ex_01_JavaBasics;

import java.util.Scanner;

public class Ex19_TriangleProgram {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // s1 == s2 && s2 == s3 && s1 == s3 -- is equilateral
        // isosceles (exactly two sides are equal),
        // s1 == s2 && s1 == s3 -- is isosceles
        // or scalene (no sides are equal)
        // Use an if-else statement to classify the triangle.

        // Given three input values representing the lengths of the sides,
        Scanner scanner_s1 = new Scanner(System.in);
        System.out.println("Enter the Value........");

        int value1 = scanner_s1.nextInt();

        int value2 = scanner_s1.nextInt();

        int value3 = scanner_s1.nextInt();

        if (value1 == value2 && value2 == value3 && value1 == value3) {
            System.out.println("It's equilateral Triangle");
        }
            else if(value1 == value2 || value2 == value3 || value1 == value3) {
            System.out.println("It's is isosceles");
        }
            else {
            System.out.println("No Sides are equal");

        }
            scanner_s1.close();
        }
    }
