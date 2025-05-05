package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.LIST;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Ex60_List04_Vector {

    public static void main(String[] args) {

        Vector v = new Vector();
        Vector v1 = new Vector();

        // Vector initial Capacity is 10

        v.add("123456");
        v.add("Parveen");
        v.add("Pintu");
        v.add(1);
        v.add("Add");
        v.add("Plus");

        System.out.println(v);

        System.out.println("Enumeration Only uee in Vector");

        Enumeration EMI  = v.elements();
        while (EMI.hasMoreElements()){
            System.out.println(EMI.nextElement());
        }

        // Print another list

        System.out.println("Vector with numeric and Sorting");

        v1.add(1000);
        v1.add(23);
        v1.add(67);
        v1.add(78);
        v1.add(100);
        v1.add(2399);
        v1.add(679);
        v1.add(788);

        System.out.println(v1);
        Collections.sort(v1); // Collections is a class and Collection is interface.
        System.out.println(v1);


    }
}
