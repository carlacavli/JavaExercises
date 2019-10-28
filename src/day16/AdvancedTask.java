package day16;

//import org.junit.Test;

public class AdvancedTask {
    //TODO  write program that prints this figures using loops
    //   *
    //  ***
    // *****
//    @Test
    public void t1() {
        int l = 6;
        for (int i = 0; i < l; i++) {
            for (int j = 1 + l / 2; j >= i; j--)
                System.out.print("$");
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }


    //TODO  write program that prints this figures using loops
    // *****
    //  ***
    //   *

//    @Test
    public void t2() {
        int l = 6;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("$");
            for (int j = (l - i - 1) * 2; j >= 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    //TODO  write program that prints this figures using loops
    //   *
    //  ***
    // *****
    //  ***
    //   *

//    @Test
    public void t3() {
        int l = 9;
        for (int i = 0; i < l; i++) {
            for (int j = l / 2; j > i && i < l / 2; j--)
                System.out.print("$");
            for (int j = 1; j <= i - l / 2 && i > l / 2; j++)
                System.out.print("$");
            for (int j = 0; j <= i + i && i <= l / 2; j++)
                System.out.print("*");
            for (int j = (l - i - 1) * 2; j >= 0 && i > l / 2; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    //TODO  write program that prints this figures using loops
    //   *
    //  *#*
    // *###*
    //*#####*
//    @Test
    public void t4() {
        int l = 10;
        for (int i = 0; i < l; i++) {
            for (int j = l - 2; j >= i; j--)
                System.out.print("$");
            System.out.print("*");
            for (int j = 1; j <= i + i - 1; j++)
                System.out.print("#");
            if (i > 0)
                System.out.print("*");

            System.out.println();
        }
    }

    //TODO  write program that prints this figures using loops
    //   *
    //  * *
    // *   *
    //  * *
    //   *

//    @Test
    public void t5() {
        int l = 20;
        for (int i = 0; i < l; i++) {
            System.out.print(i);
            for (int j = l / 2; j >= i && i < l / 2; j--)
                System.out.print("$");
            for (int j = 0; j <= i - l / 2 && i >= l / 2; j++)
                System.out.print("$");
            System.out.print("*");
            for (int j = 1; j < i + i - 1 && i < l / 2; j++)
                System.out.print("#");
            for (int j = (l - i - 2) * 2; j >= 0 && i >= l / 2 && i < l - 1; j--)
                System.out.print("#");
            if (i > 0 && i < l - 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
