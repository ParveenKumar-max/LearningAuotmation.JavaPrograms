package Ex_01_JavaBasics.Ex55_Abstraction_Interface;

public class Ex55_02_Abstraction {

    interface I11{}
    interface I12{}
    class A1{}
    class B1{}
    abstract class Pramod{
        abstract void pp();
    }
    class Test1 extends A1{}
    //class Test2 extends A1,B1{} // Multiple Interheirn in class is not allowed
    class Test3 implements I11{}
    class Test4 implements I12,I11{}
    class Test5 extends A1 implements I11,I12{}
    //class Test6 implements I11 extends A1{}
//interface I3 extends A1{}
    interface I3{}




}
