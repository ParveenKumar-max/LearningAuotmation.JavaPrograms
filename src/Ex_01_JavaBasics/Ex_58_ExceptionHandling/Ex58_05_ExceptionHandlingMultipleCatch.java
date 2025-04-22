package Ex_01_JavaBasics.Ex_58_ExceptionHandling;

import java.util.Scanner;

public class Ex58_05_ExceptionHandlingMultipleCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Value");

        try{
            int value = scanner.nextInt();
            if (value % 2 == 0){
                System.out.println("Value is Even");
            }else {
                System.out.println("Value is Odd");
            }
        }catch (ArithmeticException e){
            System.out.println("Handle by Subclass");
        }catch (Exception e){
            System.out.println("Handle by SuperClass");
        }
        finally {
            scanner.close();
        }
    }
}
