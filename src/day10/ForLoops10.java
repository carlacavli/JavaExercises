package day10;

public class ForLoops10 {
    public static void main(String[] args) {
        // This will cause error;
        // int x;

        // redeclaring x as long will not work
        for (long y = 0, x = 1; x < 5; x++) {
            System.out.print(x + " ");
        }

    }
}