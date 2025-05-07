package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.MAP;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Ex60_LinkedHashMap {

    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap();
        map.put("FirstName", "Parveen");
        map.put("LastName", "Kumar");
        map.put("salary", "30LPA");
        map.put("RollNumber", "777777");
        System.out.println(map);

        System.out.println("Using For Each Loop");

        for (Map.Entry<String, String> value1 : map.entrySet()) {
            System.out.println(value1.getKey() + "   " + value1.getValue());

        }


    }

}
