package Ex_01_JavaBasics.Ex57_Wrapper_Primitive;

public class Ex57_01_Primitive_Wrapper {

    public static void main(String[] args) {

        // Primitive Data Type --> int, byte, short. char, float, double, long, boolean
        int a = 20;
        String value = "1000";

        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now.

        // We will use the wrapper class now.
        // Integer, Byte, Short, Char, Float, Double, Long, Boolean.

        Integer a1 = 60;
        System.out.println(a1.toString());
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.hashCode(30));
        System.out.println(Integer.valueOf(Integer.toString(a1)));

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer value1 = Integer.parseInt(value);
        System.out.println(value1.toString());


        // Primitive to String
        int a2 = 50;
        Integer a3 = a2;
        System.out.println(a3.toString());

        // Boxing and Unboxing in wrapper class

        int a4 = 100;
        Integer value3 = a4;
        System.out.println(value3);
        System.out.println(value3.intValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // This Boxing -> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing

        Integer value4 = 200;
        int a5 = value4;
        System.out.println(a5);// Unboxing -> wrapper is removed, attribute, behaviour is lost.

    }
}
