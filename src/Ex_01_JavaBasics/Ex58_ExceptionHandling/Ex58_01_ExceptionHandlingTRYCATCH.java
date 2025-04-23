package Ex_01_JavaBasics.Ex58_ExceptionHandling;

public class Ex58_01_ExceptionHandlingTRYCATCH {
    public static void main(String[] args) {

        int a = 20;

       try {
           int output = a % 0;
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
}
