package day22_Practice;

import java.util.Arrays;

public class Task1 {
    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 10, 2, 0};
        String[] names = {"Zeynep", "Serkan", "Bayram"};

        System.out.println("First Numeric array : "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Numeric array : "+Arrays.toString(numbers));


        System.out.println("First String array : "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String array : "+ Arrays.toString(names));
    }
}
