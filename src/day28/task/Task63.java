package day28.task;

public class Task63 {
    // Given an array of ints,
    // print "true" outside of loop, if it does not contains 4
    // {4, 1, 1} => false
    // {1, 2, 3} => true
    // DON'T USE BREAK
    // Hint: use boolean variable to hold state
    public static void main(String[] args) {
        int[] numbers = {3, 1, 1};

        boolean haveFour = false;
        for (int number : numbers) {
            if (number == 4) {
                haveFour = true;
            }
        }

        if (haveFour = false) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

}
