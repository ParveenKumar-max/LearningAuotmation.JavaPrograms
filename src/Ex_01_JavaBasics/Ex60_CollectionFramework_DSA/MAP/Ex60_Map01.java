package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.MAP;

import java.util.*;

public class Ex60_Map01 {

    public static void main(String[] args) {

        Map<String,Object> student1 = new HashMap();
        student1.put("name","Diwakar");
        student1.put("phone","9876543210");
        student1.put("address1","Bangalore");
        student1.put("address2",123);

        System.out.println("HashMap Print Random order of elements "+ student1);

        Map<String,Object> student2 = new HashMap();
        student2.put("name","Lukcy");
        student2.put("phone","96789876");
        student2.put("address1","Delhi");
        student2.put("address2",345);

        System.out.println("HashMmap Print Random order of elements "+ student2);

        List students = new ArrayList();
        students.add(student1); // Insert map into List<ArrayList>
        students.add(student2); // Insert map into List<ArrayList>

        System.out.println("ArrayList Maintain the insertion order"+ students);
        System.out.println("ArrayList Maintain the insertion order"+ student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);



    }
}
