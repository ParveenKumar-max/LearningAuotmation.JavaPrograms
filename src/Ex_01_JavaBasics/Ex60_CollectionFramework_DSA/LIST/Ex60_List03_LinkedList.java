package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.LIST;

import java.util.*;

public class Ex60_List03_LinkedList {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Parveen"); //0
        list.add("Kumar");  //1
        list.add(2,"123456"); // "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
        list.add("Chaudhary");
        list.add("Chaudhary");
        System.out.println(list);

        System.out.println("================");

        list.addFirst("AddFirst");
        list.addLast("LastAdd");
        System.out.println(list);

        System.out.println("================");

        list.remove(3);
        list.remove("Chaudhary");
        System.out.println(list);

        System.out.println("=================================");


        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("============================");

        for (Object O : list){
            System.out.println(O);
        }

        System.out.println("Enumeration == For List");

     //   Enumeration<Object> Em1 = list.elements();
        //   Enumeration only used with legacy classes and mainly used with Older classes.

        // Like Vector and Hashtable.

        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Object L1 = listIterator.next();
            System.out.println(L1);
        }


    }
}
