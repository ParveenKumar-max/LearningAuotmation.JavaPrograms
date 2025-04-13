package Ex_01_JavaBasics.Ex49_ConstructorOops;

public class Ex49_02_DefualtConstructor {
    public static void main(String[] args) {

        DefaultValue  DC1 = new DefaultValue();
        DC1.id = 1; DC1.age = 30; DC1.name = "Parveen"; DC1.salary = 30L; DC1.rollNumber = 3750;
        DC1.Method1();

        System.out.println("-----------------");

        DefaultValue  DC2 = new DefaultValue();

        DC2.id = 2; DC2.age = 30; DC2.name = "Chaudhary"; DC2.salary = 50L; DC2.rollNumber = 4750;
        DC2.Method1();


    }
}

class DefaultValue{   // This is class

    int id;
    int age;
    String name;
    double salary;
    float rollNumber;


    public DefaultValue(){   // Default Constructor
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.rollNumber = rollNumber;

    }

    public void Method1(){  // Method -- Declare all attributes
        System.out.println(id);
        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(rollNumber);

    }






}



