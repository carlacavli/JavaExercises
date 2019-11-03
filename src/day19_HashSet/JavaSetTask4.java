package day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSetTask4 {
    //4. Write a Java program to empty an hash set.
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
        //part1
        // numbers.clear();
        // System.out.println(numbers); //=> []

        //part 2, remove only 1 and 2 using .removeAll method
        // Hint: create second HashSet with 1 and 2
        ArrayList<Integer> s2 = new ArrayList<>();
        s2.add(1);
        s2.add(2);
        numbers.removeAll(s2);
        System.out.println(numbers); //=> [3, 5, 10]

        // Removes from this set all of its elements
        // that are contained in the specified collection
    }
}
