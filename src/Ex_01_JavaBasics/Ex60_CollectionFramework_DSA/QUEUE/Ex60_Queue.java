package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.QUEUE;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Ex60_Queue {

        public static void main(String[] args) {
            Queue<String> queue = new LinkedList<>();

            // 1. add() - throws exception if full (not applicable to LinkedList)
            queue.add("A");
            queue.add("B");
            queue.add("C");
            System.out.println("Queue after add(): " + queue);
            //Output -- Queue after add(): [A, B, C]

            // 2. offer() - returns false if full (returns true here)
            boolean added = queue.offer("D");
            System.out.println("Offered D: " + added);
            System.out.println("Queue after offer(): " + queue);
            //Output --> Offered D: true
            //Queue after offer(): [A, B, C, D]

            // 3. remove() - removes head, throws exception if empty
            String removed = queue.remove();
            System.out.println("Removed with remove(): " + removed);
            System.out.println("Queue after remove(): " + queue);
            //Output --> Removed with remove(): A
            //Queue after remove(): [B, C, D]

            // 4. poll() - removes head, returns null if empty
            String polled = queue.poll();
            System.out.println("Removed with poll(): " + polled);
            System.out.println("Queue after poll(): " + queue);
            // Output --> Removed with poll(): B
            //Queue after poll(): [C, D]

            // 5. element() - retrieves head, throws exception if empty
            String head = queue.element();
            System.out.println("Head using element(): " + head);
            System.out.println("Queue after element(): " + queue);
            // Output --> Head using element(): C
            //Queue after element(): [C, D]

            // 6. peek() - retrieves head, returns null if empty
            String peeked = queue.peek();
            System.out.println("Head using peek(): " + peeked);
            System.out.println("Queue after peek(): " + queue);
            // Output --> Head using peek(): C
            //Queue after peek(): [C, D]

            // Clear queue to show exceptions/null behavior
            queue.clear();
            System.out.println("\nQueue cleared: " + queue);

            // Safe with poll/peek
            System.out.println("poll() on empty: " + queue.poll());   // null
            System.out.println("peek() on empty: " + queue.peek());   // null
            // Output --> poll() on empty: null
            //peek() on empty: null

            // Unsafe with remove/element (will throw NoSuchElementException)
            try {
                queue.remove();
            } catch (NoSuchElementException e) {
                System.out.println("remove() on empty: Exception -> " + e);
            }

            try {
                queue.element();
            } catch (NoSuchElementException e) {
                System.out.println("element() on empty: Exception -> " + e);
            }
        }

        // Output -- > remove() on empty: Exception -> java.util.NoSuchElementException
    //element() on empty: Exception -> java.util.NoSuchElementException
    }

