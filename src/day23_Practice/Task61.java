package day23_Practice;

public class Task61 {
    // Given an array of ints,
    // print true if it contains no 4's
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        for (int n : nums) {
            if (n != 4) {
                System.out.println(true);
            }
        }
    }

}
