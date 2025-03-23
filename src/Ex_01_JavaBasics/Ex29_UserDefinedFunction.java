package Ex_01_JavaBasics;

public class Ex29_UserDefinedFunction {
    public static void main(String[] args) {

        // User Defined function

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        result1(); //Without Parameter/Without Return Type

        result2(); //Without Parameter / With Return Type

        result4("Parveen", 77f, 1L);
        result4("Ravina", 44f, 2L);

        int result = result3(20, 30);
        System.out.println("With Parameter / With Return Type" + " " + result);

    }

    static void result1() {
        System.out.println("Without Parameter/Without Return Type");

    }

    static String result2() {
        System.out.println("Without Parameter / With Return Type");
        return "Hi, How Are you";

    }
    // 90% we used this method in our programming or Automation
    //With  Parameter / Without Return Type
    static void result4(String name, float roll_num, double salary){
        System.out.println("Employee Name is --> "+ " "+ name + ","+ "Roll Num is" +","+roll_num+" "+"salary"+" "+ salary);
    }

    //With  Parameter / With Return Type
    static int result3(int a, int b) {
        return(a+b);
    }


}
