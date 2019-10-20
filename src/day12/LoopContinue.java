package day12;

public class LoopContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("beginning " + i);
            if (i >= 4) { // 1 2 3 [4 5]
                continue;
            }
            System.out.println("ending " + i);
            System.out.println();
        }
    }
}
