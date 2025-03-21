package Ex_01_JavaBasics;

public class Ex20_IfElseCondtns {
    public static void main(String[] args) {

        // if, else and elseif Conditions
    /*    int age = 25;
        if (age < 25){
            System.out.println("Not Able to vote");
        } else if (age >= 25) {
            System.out.println("Able to vote");
        }
        else {
            System.out.println("Note Defined");
        }*/

        // Take the user input from via command-line argument (CLI)

      int value1 = Integer.parseInt(args[0]);
        System.out.println("Taking user input via CLI");

        if (value1 < 30){
            System.out.println("Buy one more Flat");
        } else if (value1 >= 70) {
            System.out.println("BuyTwo mre Flat");
        }else {
            System.out.println("Wait for Correct Time");
        }
    }
}
