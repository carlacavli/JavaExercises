package day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaSetEx1 {
    public static void main(String[] args) {
        System.out.println("ArrayList------------------------");
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(3);
        listNumbers.add(3);
        listNumbers.add(3);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        HashSet<Integer> setNumbers = new HashSet<>();
        setNumbers.add(3);
        setNumbers.add(3);
        setNumbers.add(3);
        System.out.println(setNumbers);
    }
}
