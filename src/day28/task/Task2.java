package day28.task;

public class Task2 {
    // write a java program that find maximum
    // of three numbers
    public static void main(String[] args) {
        int a = 200;
        int b = 200;
        int c = 200;

        if (a >= b && a >= c) {
            System.out.println(a + " a is the maximum number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " b is the maximum number.");
        } else {
            System.out.println(c + " c is the maximum number.");
        }

    }
}
