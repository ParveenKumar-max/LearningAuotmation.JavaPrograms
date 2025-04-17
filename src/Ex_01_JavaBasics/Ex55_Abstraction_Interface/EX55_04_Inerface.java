package Ex_01_JavaBasics.Ex55_Abstraction_Interface;

public class EX55_04_Inerface {
    public static void main(String[] args) {

        Son1 s1 = new Son1();
        s1.money();


    }
}


// Created two interface class, Now creating third to implements it.

class Son1 implements Father1, Mother1{

    Son1(){
        System.out.println("Default Constructor always pick first while creating object of this class");

    }

    @Override
    public void money() {
        System.out.println("In Interface, while implemeting, we hide the internal implementation");
    }
}

interface Father1{

    public void money();


}

interface Mother1{

    public void money();

}
