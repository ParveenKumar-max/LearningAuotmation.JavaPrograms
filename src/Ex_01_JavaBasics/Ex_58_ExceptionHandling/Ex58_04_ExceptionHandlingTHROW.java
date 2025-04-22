package Ex_01_JavaBasics.Ex_58_ExceptionHandling;

public class Ex58_04_ExceptionHandlingTHROW {
    public static void main(String[] args) {

       try {
           String value = null;
           value.trim(); // "main" java.lang.NullPointerException
       } catch (Exception e) {
           System.out.println(e.getMessage());
           System.out.println("Value is null");
           //throw new RuntimeException(e);
           //throw used with in the function
       }

    }
}
