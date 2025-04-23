package Ex_01_JavaBasics.Ex58_ExceptionHandling;

public class Ex58_07_ExceptionHandlingTHROW {

    public static void main(String[] args) throws Exception {

        value3();
    }

    static void value3() throws Exception {
        int a = 10;

        if (a == 0){
            System.out.println("Value Matched");
        }else {
            //System.out.println("Unmatched Value");
            throw new Exception("Unmatched Value");

        }

    }
}


