package Ex_01_JavaBasics.Ex56_StaticKeyword;

public class Ex56_01_StaticKeyword {

    public static void main(String[] args) {

        SecondStatic SS = new SecondStatic();
        SS.value1("Parveen", "Chaudhary"); // It will call Normal method
        System.out.println(SS.a); // calling local variable in main class

        System.out.println(SecondStatic.a1); // Static method and variable calls with class name not object.
        SecondStatic.value2();

        SecondStatic.Inner.value3();  // Call Nested class
    }

}

class SecondStatic {

    int a = 40;
    static int a2 = 200;
    static int a1 = 50;


    public String value1(String a, String b) { // Normal Function
        System.out.println("Name is:" + a + "SurName is: " + b);
        System.out.println(a2); // You can call static variable in Non-static or Normal method.
        return a + b;
    }

    static {  // Static Block
        System.out.println("Static Block");
    }
     static int value2(){
         System.out.println(a2);
         //System.out.println(a); // You can't call Non-static variable in static method.
        return 30; // Static Method
    }
    static class Inner{
        static void value3(){
            System.out.println("Nested Class");
        }
    }

    //    static class C{
    //        // Not useful
    //    }

}
/*
The Output is:

Static Block
Name is:ParveenSurName is: Chaudhary
40
50
Nested Class*/
