package day22_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        String[] s2 = new String[2];
        s2[0] = "apple";
        s2[1] = "lemon";

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("lemon");
        System.out.println(list);

        String[] s22 = {"apple", "lemon"};
        List<String> list2 = Arrays.asList("apple", "lemon");
        System.out.println(list2);
    }
}
