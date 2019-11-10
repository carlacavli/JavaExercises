package day23_Practice;

public class Task60 {
    // Given an array of ints,
    // print "I have one" if it contains 1's
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 4};
        for (int n : nums) {
            if (n == 1) {
                System.out.println("i have it");
            }
        }
    }

}