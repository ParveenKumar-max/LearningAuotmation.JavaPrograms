package Ex_01_JavaBasics;

public class Ex35_String {
    public static void main(String[] args) {

       // What is String  --  bunch of character or collection of String

        // Different way to create String

        String value1 = "Parveen One way";   // This value stored in String Constant Pool within the heap area.

        String value2 = new String("Parveen Second Way");  // This value stored in Heap Area

        // Why String are Immutable and How it's different from Primitive Data type

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.print(str1 == str2); // Output: true --> Both variable assign to Hello value (Literal)

        // In that Case, it will create two String in String Constant Pool ( str1 and str2 )
        String str11 = "Parveen";
        System.out.println(str1);
        // In that case it will create two string --> Parveen and Parveen How are you !
        System.out.println(str11.concat(" "+" "+"How Are you !"));

        // check with Primitive Data Type.
        int num = 10;
        num = 20;
        System.out.println(num);


        String value3 =  new String("Parveen");
        String value4 = new String("Parveen...How are you!");

        System.out.println(value3);
        System.out.println(value4);

        System.out.println(str11 == value4);  // Output  -> False
        System.out.println(value1 == str1);  // Output  -> False
        System.out.println(str11 == str1);  // Output   -> False
        System.out.println(str2 == str1);   // Output   -> True
    }
}
