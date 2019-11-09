package day22_Practice;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] a = {1,2,3,4, 10};
        int[] b = {1,2,3,4};

//        Arrays.sort(a);
        boolean isEqual = Arrays.equals(a, b);
        System.out.println("Are they equal: " + isEqual);

//
    }
}
