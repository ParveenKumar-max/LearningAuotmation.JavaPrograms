package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex60_List02_ArrayList {

    public static void main(String[] args) {

        ArrayList ar1 = new ArrayList();
        ar1.add("123456");  //0
        ar1.add("123456");  //1
        ar1.add("Parveen"); //2
        ar1.add("Kumar");   //3
        ar1.add("Kumar");   //4
        System.out.println(ar1);
        System.out.println(ar1.isEmpty());
        System.out.println(ar1.size());
        System.out.println(ar1.reversed());
        System.out.println(ar1.indexOf(3));
        // Why? → because indexOf searches for an element, not an index.
        //You're passing 3 (an Integer) to indexOf,
        // but your ArrayList contains Strings like "123456", "Parveen", "Kumar", not numbers.
        // If you want the item at index 3, you should use ar1.get(3) instead.
        System.out.println(ar1.get(3));


        System.out.println("====================================");


        List list = new ArrayList();
        System.out.println(list.isEmpty());
        list.add("123456"); //0
        list.add("123213"); //1
        list.add("qwerty"); //2
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(1));
        System.out.println(list.contains("qwerty"));
        System.out.println(list.get(1));
        System.out.println(list);

        System.out.println("===================================");

        for ( int i = 0; i < list.size(); i++) { // For loop
            System.out.println(list.get(i));
        }

        System.out.println("================================");

        for (Object o: list){ // For Each loop
            System.out.println(o);
        }

        System.out.println("Using Iterator===Print List");

        Iterator I1 = list.iterator();

        while(I1.hasNext()){
            System.out.println(I1.next());
        }

        System.out.println("Using Iterator===Print ArrayList");

        Iterator I2 = ar1.iterator();

        while(I2.hasNext()){
            System.out.println(I2.next());
        }

        //ListIterator is the most common used in Collection Framework.

        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Object L1 = listIterator.next();
            System.out.println(L1);
        }

        ListIterator listIterator1  = ar1.listIterator();
        while (listIterator1.hasNext()){
            Object S1 = listIterator1.next();
            System.out.println(S1);
        }
    }
}
