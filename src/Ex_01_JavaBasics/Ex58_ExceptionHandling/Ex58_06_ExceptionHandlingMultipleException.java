package Ex_01_JavaBasics.Ex58_ExceptionHandling;

public class Ex58_06_ExceptionHandlingMultipleException {
    public static void main(String[] args) {

      //  String a1 = null;
     //   a1.trim();
      //  int a = 10/0;

        // There are three ways to handle the exception, as you can see we have two types of exception.

        // First way to Handle

     /*  try {
           String a2 = null;
           a2.trim();
       }catch (NullPointerException e){
           System.out.println("Null Pointer exception -- Handle by Subclass");
       }
       try{
           int value = 10/0;
       }catch (ArithmeticException e){
           System.out.println("Arithmetic Exception -- Again Handle by Subclass");
       }finally {
           System.out.println("Out of the Program -- Thank you!");
       }*/


        // Second way to Handle -- And this is actual ways when we work with automation

        try{
            String a1 = null;
            a1.trim();
            int a = 10 / 0;
        }catch (ArithmeticException  | NullPointerException e){
            System.out.println("Handled by Subclass");
        }catch (Exception e){
            System.out.println("Handled by SuperClass");
        }
        finally {
            System.out.println("Thank you !");
        }
    }
}
