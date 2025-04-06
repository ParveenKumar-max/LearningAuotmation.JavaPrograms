package Ex_01_JavaBasics;

public class Ex46_OddEvenMDArray {
    public static void main(String[] args) {

        // Found Odd and Even via Array

        int[] value1 = {1,2,3,4,5,6,7,78,987,5,3,5,8,35435,46,567};

        for (int i = 0; i < value1.length; i++) {
            if (value1[i] % 2 == 0){
                System.out.println("Value is Even" +" " + value1[i]);
            }
         else
            {
                System.out.println("Value is Odd"+" " + value1[i]);
            }
        }
    }
}
