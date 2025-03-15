package Ex_01_JavaBasics;

public class Ex17_UserInputValue {
    public static void main(String[] args) {
        // User Input --> Name, Age, and salary

        String result_name = args[0];
        String result_age = args[1];
        String result_salary = args[2];
        String result_Max = args[3];

        int Value1 = Integer.parseInt(result_age);
        int Value2 = Integer.parseInt(result_Max);
        String Value = (Value2 > Value1) ? "Print Value2" : "Print Value1";

        System.out.println("Ternary operator" +" " + Value);
        System.out.println("Name of the Person is" + " " + result_name);
        System.out.println("Person age is " + " " + result_age);
        System.out.println("Name of the Person is" + " " + result_salary);


    }
}
