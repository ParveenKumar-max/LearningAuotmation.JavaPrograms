package Ex_01_JavaBasics.Ex55_Abstraction_Interface;

public class Ex55_01_Abstraction {

    public static void main(String[] args) {

        Son s1 = new Son();
        s1.loan50K();
        s1.value1();
        //s1.Display();
        s1.loan25k();

    }
}

abstract class Father{  // abstract class

    abstract void loan50K();  // abstract Method, we can say Incomplete method.

    void loan25k(){  // Complete Method
        System.out.println("Given 25K");
    } // Normal Method

    Father(){
        System.out.println("Dafault Constructor");
    } // Constructor

    Father(int a){
        System.out.println("Parametrized Constructor");
    } // Parameterized Constructor
    void Display(){

        System.out.println("Show all result");

    } // Normal Method
}

class Son extends Father {


    @Override
    void loan50K() {
        System.out.println("Child has to Pay the loans");
    }

    public void value1(){
        super.Display();
    }


}