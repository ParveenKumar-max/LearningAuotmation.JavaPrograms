package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.QUEUE;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex60_PriorityQueue {

    public static void main(String[] args) {


        Queue q1 = new PriorityQueue();
        q1.add("First");
        q1.add("Parveen");
        q1.add("Kumar");
        q1.add("Chaudhary");
        q1.add("123456");
        // q1.add(1234567890);
        q1.offer("Yellow");

        Iterator I1 = q1.iterator();
        while (I1.hasNext()) {
            System.out.println(I1.next());
        }


        System.out.println("Offer " + q1);
        // It will add the element at last. If you want to add an element at last in queue, use  offer().
        // Output -->  [123456, Chaudhary, Kumar, Parveen, First, Yellow]
        q1.remove();
        System.out.println("Remove " + q1);
        // It will remove and returns the Head element. "123456" -- removed
        //Output -->   [Chaudhary, First, Kumar, Parveen, Yellow]
        //print the value in alphabetical order.
        q1.poll();
        System.out.println("poll " + q1);
        //Output --> [First, Parveen, Kumar, Yellow]
        //Removes and returns the head element.
        q1.peek();
        System.out.println("Peek " + q1);
        //Retrieves but doesn't remove the head element; returns null if queue is empty
        //Output --> [First, Parveen, Kumar, Yellow]
    }


}
