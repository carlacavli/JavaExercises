package day19_HashSet;

import java.util.HashSet;

public class JavaSetTask2 {
    //2. Write a Java program to iterate through all elements in a hash list.
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


    }
}
