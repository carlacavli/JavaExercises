package day20_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask12 {
    //12. Write a Java program to get a
    //    collection view of the values contained in this map.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println(map.values());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();

            System.out.println("value is " + value);
        }
    }
}
