package Ex_01_JavaBasics.Ex50_Inheritence;

import java.sql.SQLOutput;

public class Ex50_03_Multilevel2 extends Ex50_04_Multilevel3{

    int a = 10;
    int b = 20;

    public String Milevel0301(){

        String Num = "Milevel0301";
        System.out.println(Num);
        return Num;

    }
    public int Milevel0302(){

        System.out.println(a + b);
        return a + b;

    }
    // JVM first search CommonMethod, if JVM didn't find Common Method in this class then it
    // move to extends class, and checks is there any Common method present or not.
    void CommonMethod(){

        System.out.println("Common Method");


    }
}
