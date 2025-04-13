package Ex_01_JavaBasics.Ex50_Inheritence;

import java.sql.SQLOutput;

public class Ex50_01_SingleInheritance {

    public static void main(String[] args) {

        Ex50_01_SingleInheritance Ex50 = new Ex50_01_SingleInheritance();
        Ex50.SuperClass();  // Main class only access the method that defines inside the class. Like SUPERCLASS

        SingleInheri single = new SingleInheri();
        single.SingleInherit(); // Another class we can call by creating an object in the main method.
        // But can we call SuperClass methods via using main SingleInherit object, -- No we can't

        //So we use extends keywords --> Single Inheritance
        System.out.println("Using Extends Keywords ---- Call child method");

        SingleInheri single1 = new SingleInheri();
        single1.SuperClass();
        single1.SingleInherit();

    }
    void SuperClass() {
        System.out.println("Super Class Value");
    }
}



class SingleInheri extends Ex50_01_SingleInheritance{

    void SingleInherit() {
        System.out.println("Print SingleInherit");
    }

}


