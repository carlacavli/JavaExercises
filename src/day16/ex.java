package day16;

import java.util.Random;

public class ex {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);

        num = 3;
        System.out.println(num);

        Random random = new Random();
        num = random.nextInt(100);

        System.out.println(num);

    }
}
