package Ex_01_JavaBasics.Ex56_StaticKeyword;

public class Ex56_StaticKeyword {

    public static void main(String[] args) {

        oneStatic OS = new oneStatic();
        // class // referenceVariable = object creation.
        OS.value();

        oneStatic OS1 = new oneStatic();
        OS.value();


    }

}


class oneStatic{

    public void value(){
        System.out.println("Normal Method");
    }

    oneStatic(){
        System.out.println("Default Constructor");
    }

    static{ // Static blocks only run once, when class loads

        System.out.println("Static Method! No need to create object");
    }

    {
        System.out.println("This is Instance initialization Block ");
    }

}

/*
Output:
Static Method! No need to create object
This is Instance initialization Block
Default Constructor
Normal Method*/
