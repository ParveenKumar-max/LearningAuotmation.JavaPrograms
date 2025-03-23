package Ex_01_JavaBasics;

public class Ex27_FunctionTypes {
    public static void main(String arg[]){
        // call class
        class1();     // static method we can directly call

        // Built-in function

        int age = 10, volume  = 20;
        int result = Math.multiplyExact(10, 20);
        System.out.println(result);

        // User Define function

        int result1 =  int_type(10,20);
        System.out.println(result1);

        boolean result2 = boolean_type(30,90);
        System.out.println(result2);

  }

    // Define class
    static void class1(){
        System.out.println("Run class1");
    }

    static int int_type(int a, int b){
            return a+b;
    }

    static boolean boolean_type(int a, int b){
        return a>b;
    }


}
