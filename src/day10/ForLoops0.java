package day10;

public class ForLoops0 {

    public static void main2(String[] args) {

        int a;
        a = 1;
        System.out.println(a);
        a = 2;
        System.out.println(a);
        a = 3;
        System.out.println(a);
        a = 4;
        System.out.println(a);
        a = 5;
        System.out.println(a);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }

        System.out.println("Print again the i values, with different condition");

        for (int i = 0; i <= 5; i++) {
            System.out.println("i is: " + i);
        }
    }
}
