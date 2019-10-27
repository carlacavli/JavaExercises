package day16;

public class NestedLoopTask1 {
    // task
    // print grid of "#" of 10 rows and 10 columns
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
