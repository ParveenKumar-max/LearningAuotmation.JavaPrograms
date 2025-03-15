package Ex_01_JavaBasics;

import java.util.Scanner;

public class Ex18_ScannerInput {
    public static void main(String[] args) {
        // Take input from scanner class

        Scanner get_input = new Scanner(System.in);
        int number = get_input.nextInt();

        if (number % 2 ==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
         System.out.println(number);

 // Second way to take input from arguments -- Edit Configuration--> Program Arguments

        String get_result2 = args[0];
        int get_result3  = Integer.parseInt(get_result2);
        if (get_result3 % 2 == 0) {
            System.out.println("Program Argument Number is Even");
        } else {
            System.out.println("Program Argument Number is Odd");
        }
    }
}
