package Ex_01_JavaBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex28_BuiltInFunctions {
    public static void main(String[] args) {

        // All Built-In function used in JAVA
        // DataType functions
        int a = 30, b =40, c = 50;
        int result = Math.multiplyExact(30,40);
        float result1 = Math.divideExact(50,30);
        System.out.println(result+result1);

        // Arrays Built_In functions

        int numarray[] = {4,7,98,23,87,2,56,890,23,53567,3423,1216,878787,2323544,687878,3445634,4,5,6,7,8,9,0};
        Arrays.sort(numarray);
        System.out.println(numarray); // if you didn't convert it to String, then output is -- [I@6f496d9f
        System.out.println("Sorting the arrays" + " "+ Arrays.toString(numarray));

        // string in built functions -- In String we have multiple functions

        String str_value = "Parveen Kumar";
        System.out.println("Calculate Length of String"+ " " + str_value.length());
        System.out.println("Concatenate of String" +" "+ str_value.concat(str_value));
        System.out.println("Trimmed the String" + " "+ str_value.trim());
        System.out.println("Uppercase String" +" "+ str_value.toUpperCase());
        System.out.println("Lowercase String"+ " "+ str_value.toLowerCase());

    }
}
