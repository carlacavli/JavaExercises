package day23_Practice;

public class Task62 {
    // Given an array of ints,
    // print "I have one" outside of loop, if it contains 1's
    // so if you have multiple 1's if should print "I have one" only once
    // {1, 1, 1} =>  "I have one"
    // DON'T USE BREAK
    // Hint: use boolean variable to hold state
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 5};
        boolean haveOne = false;

        for (int number : numbers) {
            // write your code here
            if (number == 1) {
                haveOne = true;
            }
            // end of your code
        }
        if (haveOne) {
            System.out.println("I have one");
        }
    }
}
