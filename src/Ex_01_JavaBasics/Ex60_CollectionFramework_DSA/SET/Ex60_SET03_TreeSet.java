package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.SET;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex60_SET03_TreeSet {

    public static void main(String[] args) {

        TreeSet t1 = new TreeSet();
        t1.add("Apple");
      //  t1.add(123456);
        t1.add("apple");
        t1.add("09876");
        t1.add("Chaudhary");

       // t1.addFirst("First"); t1.addLast("Last"); Both these function are not allowed in TreeSet.
        // It's part of LinkedList.

        System.out.println(t1);
        System.out.println(t1.size());
        System.out.println(t1.first());
        System.out.println(t1.getClass()); //get(int index) method like you’d find in a List (e.g., ArrayList, LinkedList).

        // Getting Exception --> "main" java.lang.ClassCastException
        // Because, Collection interface can't sort between two data Types.

        System.out.println("++Using For Each loop++");

        for (Object O  : t1){
            System.out.println(O);
        }

        System.out.println("++Using Iterator++");

        Iterator i1 = t1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }




    }
}
