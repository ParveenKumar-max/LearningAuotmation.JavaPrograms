package Ex_01_JavaBasics.Ex50_Inheritence;

public class Ex50_02_MultilevelInheritance extends Ex50_03_Multilevel2{

    public static void main(String[] args) {

        // When we use extend Keyword for INHERIT the class Ex50_03_Multilevel2,
        // we can access class and Method.
        // Now Ex50_03 extends Ex50_04, Now we can access all method and attributes of Ex50_04 class.
        Ex50_02_MultilevelInheritance Ex50_02 = new Ex50_02_MultilevelInheritance();
        Ex50_02.CommonMethod();
        Ex50_02.Milevel0301();
        Ex50_02.Milevel0302();
        Ex50_02.CommonMethod();

        // Access the same class Method with in file, then we have to create an object of the class.

        Multilevel1 MI1 = new Multilevel1();
        MI1.Firstname = "Parveen";
        MI1.LastName = "Chaudhary";
        MI1.id = 777;
        MI1.Milevel();
    }
}

class Multilevel1{

    int id;
    String Firstname;
    String LastName;

     void Milevel(){
        System.out.println("Id is:" + id +" "+ "Firstname is " + Firstname + " "+ "LastName" + LastName);

    }
}