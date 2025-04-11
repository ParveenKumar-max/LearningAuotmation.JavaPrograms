package Ex_01_JavaBasics;

public class Ex52_ParametrizedConstructor {
    public static void main(String[] args) {

        DefaultValue1 DC1 = new DefaultValue1(1,30,"Parveen", 40L, 3750);
        DC1.Method1();
        System.out.println("\n");
        DefaultValue1 DC2 = new DefaultValue1(2,20,"Chaudhary", 50L,4750);
        DC2.Method1();

    }
}

    class DefaultValue1 { // Class

        int id;
        int age;
        String name;
        double salary;
        float rollNumber;

        // Parameterized Constructor
        public DefaultValue1(int id,int age, String name, double salary, float rollNumber) {
            this.id = id;
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.rollNumber = rollNumber;
        }

        public void Method1(){

            System.out.println(id);
            System.out.println(age);
            System.out.println(name);
            System.out.println(salary);
            System.out.println(rollNumber);

        }

    }