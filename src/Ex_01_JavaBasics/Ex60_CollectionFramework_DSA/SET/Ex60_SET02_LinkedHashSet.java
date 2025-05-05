package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.SET;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex60_SET02_LinkedHashSet {

    public static void main(String[] args) {

        Set s1 = new LinkedHashSet();
        s1.add("Apple");
        s1.add("Orange");
        s1.add("Yellow");
        s1.add("Pink");
        s1.add("Pink"); // Duplicate Record
        s1.add("Chickuu");

        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.contains("Pink"));

        System.out.println("======== Using For each loop ========");


        for (Object O : s1){
            System.out.println(O);
        }

        System.out.println("=======Using Iterator=============");

        Iterator I1 = s1.iterator();
        while(I1.hasNext()){
            System.out.println(I1.next());
        }
    }
}
