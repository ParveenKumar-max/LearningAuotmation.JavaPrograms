package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.MAP;

import java.util.HashMap;

public class Ex60_HashingExample {

    public static void main(String[] args) {

        HashMap<String, Integer> hash1 = new HashMap<>();
        hash1.put("Age", 23);
        hash1.put("Age", 25);
        hash1.put("Age", 27);
        hash1.put("Age", 29);
        // Duplicate not allowed.
        // When you get the Key, it will give you value of that key.

        System.out.println(hash1.get("Age"));


    }
}
