package Ex_01_JavaBasics.Ex52_Encapsulation;

public class Ex52_02_Encapsulation {

    public static void main(String[] args) {

        Ex52_01_Encapsulation Ex52_01 = new Ex52_01_Encapsulation("SBI", "Parveen");
        System.out.println(Ex52_01.Name);
        System.out.println(Ex52_01.BankName);

        Ex52_01.Name = "Pintu Chaudhary";

        System.out.println(Ex52_01.Name);

        // Now we can see if we create a public encapsulation, we can update the data
        // So every time in encapsulation we create a private class. And use Getter and Setter.

        // Now create two new attribute wih private access modifier. But i can't acces them in other class
        // So i will create a main method in the same class.
    }









}
