package Ex_01_JavaBasics.Ex59_Generics;

public class Ex59_01_Generics01 {
    public static void main(String[] args) {

        System.out.println(TestGen(10,10));
        System.out.println(TestGen(45.5,45.5));
        System.out.println("Parveen" + " "+ "Chaudhary");


    }

    // We created two method with same name but different  parameter --> It's a Method overloading
   /* static public int TestGen(int a, int b){
        return a+b;
    }

    static public double TestGen(double a, double b){
        return a+b;
    }*/

    // Generics Method --> How to use,
    // With the help of generics method we can perform multiple action.

    static public <T> T TestGen(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}

