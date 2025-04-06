package Ex_01_JavaBasics;

public class Ex39_ArraysFunction {
    public static void main(String[] args) {

        // Arrays -- Collection of similar DataTypes
        // How to create an Array

        int[] value1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(value1.length);
        System.out.println(value1[4]);
      //  System.out.println(value1[-8]); // java.lang.ArrayIndexOutOfBoundsException

       // Below is the example to create a String Array
        String[] value2 = new String[3];
        value2[0] = "Parveen";
        value2[1] = "Parveen Kumar";
        value2[2] = "Parveen Chaudhary";

        System.out.println(value2[2]);

        for (int i = 0; i < value1.length ; i++){
            System.out.println("Number of Element we have" +" "+ value1[i]);

        }


    }
}
