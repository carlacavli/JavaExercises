package day15;

public class ReverseLoop {
    public static void main(String[] args) {
        System.out.println("normal");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nreverse");
        for (int i = 4; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
