package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Ex60_HashMap {

    public static void main(String[] args) {


        Map<String,String> map = new HashMap();
        map.put("FirstName", "Parveen");
        map.put("LastName", "Kumar");
        map.put("salary", "30LPA");
        map.put("RollNumber", "777777");
        System.out.println(map); // Print Random elements
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("LastName"));
        System.out.println(map.containsValue("30LPA"));
        System.out.println(map.get("salary"));
        System.out.println(map.entrySet());
        System.out.println(map.keySet()); // Shows the keys
        System.out.println(map.values());// shows the values


        for (Map.Entry<String,String> value1 : map.entrySet()){
            System.out.println(value1.getKey()+ " "+value1.getValue());
        }





    }
}
