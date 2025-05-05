package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import  java.util.List;

public class Ex60_List01 {

    public static void main(String[] args) {

        // You can't create a object of LIST. Because LIST is Interface.
     //   List l1 = new List(34234,true);
      //  System.out.println(l1);

        // You can use List.of function to store the same tyoe if data element.
        // But you can add it or Remove it.
        List l2 = List.of("Orange", "Apple","Chiku");
        System.out.println(l2);
    //    l2.add("Banana");  // "main" java.lang.UnsupportedOperationException


        // List is an interface and we are using classes under lIST. --> ArrayList
        List l3 = new ArrayList<>();  // Dynamic Dispatch
        l3.add("Orange");
        l3.add("123456789");
        l3.add("Parveen");
        System.out.println(l3);
        System.out.println(l3.isEmpty());
        System.out.println(l3.size());



    }
}
