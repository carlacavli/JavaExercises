package day28.task;

public class Task4 {
//    Write a Java program to find the smallest element in an array.
//    {1,34,66,1000,23,4,7,9} => 1

    public static void main(String[] args) {
        // 1. way
        int[] numbers = {0, 0, 0};

        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min:" + min);

//2.way
//        int a[] = {2, 5, 3, 1, 8};
//        Arrays.sort(a);
//        int min = a[0];
//        System.out.println(min)

    }
}
