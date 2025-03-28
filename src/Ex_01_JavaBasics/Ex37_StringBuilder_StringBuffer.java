package Ex_01_JavaBasics;

public class Ex37_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        // How to create a String, StringBuilder and StringBuffer

        // String, we can create two ways

        String value1 = "Parveen";
        String value2 = new String("Kumar");
        System.out.println(value1);
        System.out.println(value2);

        // StringBuilder

        StringBuilder stringBuilder = new StringBuilder("Parveen Kumar_StringBuilder");
        System.out.println(stringBuilder);

        // StringBuffer

        StringBuffer stringBuffer = new StringBuffer("Parveen Chaudhary_StringBuffer");
        System.out.println(stringBuffer);

    }
}
