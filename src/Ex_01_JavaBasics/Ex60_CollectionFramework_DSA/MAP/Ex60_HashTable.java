package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.MAP;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Ex60_HashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> map = new Hashtable();
        map.put("RollNumber", 123445);
        map.put("RollNumber1", 1234456);
        map.put("RollNumber2", 12344567);
        map.put("RollNumber3", 123445678);
        map.put("RollNumber4", 1234456789);
      //  map.put(null, null); //"main" java.lang.NullPointerException

        System.out.println(map);

        System.out.println("Using Enumeration =============");

        Enumeration<Integer> value = map.elements();
        while(value.hasMoreElements()){
            System.out.println(value.nextElement());
        }





    }
}
