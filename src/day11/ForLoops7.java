package day11;

public class ForLoops7 {
    public static void main(String[] args) {
        System.out.println("Example with multiple  declarations,initialiazations and update expressions");

        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.println("i is: " + i);
            System.out.println("j is: " + j);
            System.out.println("k is: " + k);
        }
    }

    public static void main2(String[] args)
    {
        int x = 2;
        for(long y = 0, z = 4; x < 10 && y < 10; x++, y++)
        {
            System.out.println(y + " ");
        }

        System.out.println(x);
    }
}
