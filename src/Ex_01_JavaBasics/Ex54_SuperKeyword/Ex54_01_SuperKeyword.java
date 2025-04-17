package Ex_01_JavaBasics.Ex54_SuperKeyword;

public class Ex54_01_SuperKeyword {


    public String value1 = "Parveen";

    Ex54_01_SuperKeyword() {

        System.out.println("First Class Constructor");

    }

    public void super1() {

        System.out.println("Super1");

    }

}

class Ex54_03_SuperKeyword extends Ex54_01_SuperKeyword {

    public String value1 = "Parveen Chaudhary";


    Ex54_03_SuperKeyword() {

        System.out.println("Second class Constructor");
    }

    public void super2() {
        System.out.println("Super2");
        super.super1();
        // Super keyword is always used in the method, Not in Main function.
        // Via Super class, we can't access private method, variable and constructor

    }

    public static void main(String[] args) {

        Ex54_03_SuperKeyword Ex54_03 = new Ex54_03_SuperKeyword();
        System.out.println(Ex54_03.value1);

        Ex54_03.super2();
        Ex54_03.super1();

        // Below is the output

            /*First Class Constructor
            Second class Constructor
            Parveen Chaudhary
            Super2
            Super1
            Super1*/
    }

}