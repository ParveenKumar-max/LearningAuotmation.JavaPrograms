package Ex_01_JavaBasics;

public class Ex14_TernaryOperator {
    public static void main(String[] args) {
    // Ternary operator
    // result = condition ? expression1 : expression2
    int var1 = 10;
    int var2 = 40;
    String Result = (var1< var2) ? "Var1 is visible" : "Var1 is visible";
    System.out.println(Result);

    int num = 10;
    String result = (num%2==1) ? "Even" : "Odd";
    System.out.println(result);

   // Nested Ternary
   // String Value = condition1 ? expression1 : (condition2 ? expression2 : expression3)
   // Result1 = (10>40) ? "var2 is visible" : (40<10) ? "var1 is visible" : "var2isvisible";
    String Result1 = (var1>var2) ? "var2 is visible" : (var2<var1) ? "var1 is visible" : "var2isvisible";
        System.out.println(Result1);




    }
}
