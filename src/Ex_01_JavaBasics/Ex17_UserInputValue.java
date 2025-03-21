package Ex_01_JavaBasics;

import java.util.Scanner;

public class Ex17_UserInputValue {
    public static void main(String[] args) {
        // User Input --> Name, Age, and salary

     /*   String result_name = args[0];
        String result_age = args[1];
        String result_salary = args[2];
        String result_Max = args[3];

        int Value1 = Integer.parseInt(result_age);
        int Value2 = Integer.parseInt(result_Max);
        String Value = (Value2 > Value1) ? "Print Value2" : "Print Value1";

        System.out.println("Ternary operator" +" " + Value);
        System.out.println("Name of the Person is" + " " + result_name);
        System.out.println("Person age is " + " " + result_age);
        System.out.println("Name of the Person is" + " " + result_salary);*/


        // Via Scanner class

        Scanner scanner_value = new Scanner(System.in);

        // Taking the input from scanner class of customer

        System.out.println("Enter the Name");
        String name = scanner_value.nextLine();

        System.out.println("Enter the Age");
        int age = scanner_value.nextInt();

        System.out.println("Enter the Salary");
        double salary = scanner_value.nextDouble();

        System.out.println("Name of the Person" +" " + name);
        System.out.println(name+ " "+ "age " +" " + age);
        System.out.println(name +" "+ "Salary is"  +" " + salary);

        scanner_value.close();


    }
}
