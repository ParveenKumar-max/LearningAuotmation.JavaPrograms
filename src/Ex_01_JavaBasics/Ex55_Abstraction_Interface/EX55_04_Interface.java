package Ex_01_JavaBasics.Ex55_Abstraction_Interface;

public class EX55_04_Interface {
    public static void main(String[] args) {

        Son1 s1 = new Son1();
        s1.money();


    }
}


// Created two interface class, Now creating third to implements it.

class Son1 implements Father1, Mother1{ 

    int i = 10;
    Son1(){
        System.out.println("Default Constructor always pick first while creating object of this class");

    }

    @Override
    public void money() {
        System.out.println("In Interface, while implemeting, we hide the internal implementation");
    }
}
// 1. Interface class created
interface Father1{

    int i = 30;
    public void money(); // Method created under interface method
    // Father1(){}  // Constructor is not allowed in interface.


}
//2. Interface class created
interface Mother1{

    public void money(); // Method created under interface method

}
