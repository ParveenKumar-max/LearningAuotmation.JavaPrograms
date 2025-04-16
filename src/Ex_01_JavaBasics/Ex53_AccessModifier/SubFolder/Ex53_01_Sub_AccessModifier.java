package Ex_01_JavaBasics.Ex53_AccessModifier.SubFolder;

import Ex_01_JavaBasics.Ex53_AccessModifier.SubFolder2.Ex53_02_SubAccessModifier2;

public class Ex53_01_Sub_AccessModifier {


    public String name;
    public String address;

    public Ex53_01_Sub_AccessModifier(String name, String address) {
        this.name = name;
        this.address = address;

    }
}

class CheckModifier {

    protected void acc1() {
        System.out.println("Print Acc1");

    } // acc1 --> The only way to access the method on another package class, is to import it, OKAY,
    // After import , you have to use extends keyowrds to access the Protected Method.

    private void acc2() {
        System.out.println("Print Acc2");
    } // acc2 --> we can't access this method because it's datatype is private.

    public void acc3() {
        System.out.println("Print Acc3");
    }
}// acc3 --> can be access anywhere, but you have to import it in the another package class.
    class RecheckModifier{
        public static void main(String[] args) {

            CheckModifier check = new CheckModifier();
            check.acc1();
            check.acc3();
        } // if you access the acc1 and acc3 in the same file, then you have to create an object on another class
        // and call it.

    }


