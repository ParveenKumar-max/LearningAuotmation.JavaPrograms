package Ex_01_JavaBasics.Ex51_Polymorphism;

public class Ex51_01_MethodOverloading {


    public static void main(String[] args) {

        Ex51_01_MethodOverloading Ex51 = new Ex51_01_MethodOverloading();
        Ex51.method1();
        System.out.println(Ex51.method1(10, 20));
        System.out.println(Ex51.method1("Parveen", "777"));
    }

    public int method1(int a, int b) {

        return a + b;

    }

    public String method1(String name, String Rollnumber){

        return ("Name" +" " + name + " "+ "RollNumber" + " "+ Rollnumber);
    }

    public boolean method1(){

        return true;

    }




}