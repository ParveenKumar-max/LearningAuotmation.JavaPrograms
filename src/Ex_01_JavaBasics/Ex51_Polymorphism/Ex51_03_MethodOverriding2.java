package Ex_01_JavaBasics.Ex51_Polymorphism;

public class Ex51_03_MethodOverriding2 {


    public int Method2(int a, int b, int c) {

        int multiply = a * b * c;
        return multiply;
    }

    public String MethodOver1() {

        String num = "Parveen";
        return num;
    }


    public static void main(String[] args) {

        Ex51_02_MethodOverriding MH1= new Ex51_02_MethodOverriding();
        MH1.Method2(10,20,30);

        Ex51_02_MethodOverriding MH2 = new Ex51_02_MethodOverriding();
        MH2.hashCode1();

        Ex51_02_MethodOverriding MH3 = new Ex51_02_MethodOverriding();
        MH2.MethodOver1();

        MethodOverriding1 MH4 = new MethodOverriding1();
        MH4.Method2(10,20,30);

        MethodOverriding1 MH5 = new MethodOverriding1();
        MH5.MethodOver1();
    }


}