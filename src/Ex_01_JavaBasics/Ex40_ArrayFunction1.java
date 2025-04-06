package Ex_01_JavaBasics;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Ex40_ArrayFunction1 {
    public static void main(String[] args) {

        // Two type to create a String Array.

        // First way for creation

        String value1[] = {"Parveen","Kumar","Chaudhary"};
        System.out.println(value1.length);
        System.out.println(value1[0]);
        System.out.println(value1[1]);
        System.out.println(value1[2]);

        System.out.println("----------------");

        // First Way to Print Array with For Loop

        for (int i = 0; i < value1.length; i++) {
            System.out.println(value1[i]);
        }

        // Second Way to Print Array with For each Loop

        System.out.println("------------");

        for (String n : value1){
            System.out.println(n);
        }

        // Second way for creation
        System.out.println(" ------------ ");
        String value2[] = new String[3];
        value2[0] = "Parveen1";
        value2[1] = "Kumar1";
        value2[2] = "Chaudhary1";

        System.out.println(value2[1]);


    }
}
