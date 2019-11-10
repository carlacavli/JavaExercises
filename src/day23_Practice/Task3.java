package day23_Practice;

public class Task3 {
//    Write a Java program to find the largest element in an array.
//    {1,34,66,1000,23,4,7,9} => 1000

    public static void main(String[] args) {
        int[] numbers = {-10, -20, -100};

        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max:" + max);
    }
}
