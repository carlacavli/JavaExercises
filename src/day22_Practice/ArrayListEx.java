package day22_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("lemon");
        System.out.println(list);

        List<String> list2 = Arrays.asList("apple", "lemon");
        System.out.println(list2);
    }
}
