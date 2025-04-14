package Ex_01_JavaBasics.Ex51_Polymorphism;

public class Ex51_02_MethodOverriding extends MethodOverriding1{

    public String MethodOver1(){

        String num = "Parveen";
        System.out.println(num);
        return num;
    }

    public int hashCode1() {
        System.out.println(super.hashCode());
        return super.hashCode();
    }

    public int Method2(int a, int b, int c){

        int multiply = a*b*c;
        System.out.println(multiply);
        return multiply;
    }
}


class MethodOverriding1 extends Ex51_03_MethodOverriding2{

    public int Method2(int a, int b, int c){

        int addition = a+b+c;
        System.out.println(addition);
        return addition;
    }

    public String MethodOver1(){

        String num = "Chaudhary";
        System.out.println(num);
        return num;
    }
}
