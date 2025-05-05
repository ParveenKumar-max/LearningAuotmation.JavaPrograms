package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex60_SET01_HashSet {

    public static void main(String[] args) {

        Set set1 = new HashSet();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates
        // only one null is allowed
        set1.add(23);
        set1.add(230);
        set1.add(230);
        set1.add(323);
        set1.add(523);
        set1.add(723);
        set1.add(823);
        set1.add(123);
        set1.add(023);
        set1.add(723);
        set1.add(null);
        set1.add(null);
        System.out.println(set1);
        //Collections.sort(set1);
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains(523));

        System.out.println("+++++++ Using For Each Loop +++++");

        for (Object O : set1) {
            System.out.println(O);
        }

        System.out.println("+++++++ Using Iterator +++++");

        Iterator I1 = set1.iterator();
        while (I1.hasNext()) {
            System.out.println(I1.next());
        }
    }

}


