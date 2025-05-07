package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex60_LinkedList {

    public static void main(String[] args) {


        Queue q1 = new LinkedList();
        q1.add("123456");
        q1.add("Parveen");
        q1.add("Kumar");
        System.out.println(q1);

        Iterator I1 = q1.iterator();
        while(I1.hasNext()){
            System.out.println(I1.next());
        }

        // No sorting, Natural Sorting




    }


}
