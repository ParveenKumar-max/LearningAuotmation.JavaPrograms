package Ex_01_JavaBasics.Ex50_Inheritence;

public class Ex50_04_HierarchicalInheritance {

    public static void main(String[] args) {

        Father F1  = new Father();
        F1.BHK1(); // Father Can only access his method because Fathe is not extended anything.
        System.out.println("Father 1BHK");
        System.out.println("/n");

        Son S1 = new Son();
        S1.BHK1();
        S1.BHK2();
        S1.BHK3();
        // In this case, Parent extends Father and Son extends Parent, so Now SON can access both classes

    }

}

class Father{

    void BHK1(){
        System.out.println("1BHK");
    }
}

class Parent extends Father{

    void BHK2(){

        System.out.println("2BHK");

    }
}

class Son extends Parent{

    void BHK3() {

        System.out.println("3BHK");

    }
}