package day32.example;

import java.util.Arrays;
import java.util.Collections;

class MyMath {
    public static int sum(int a, int b) {
        return a + b;
    }
}

public class StaticMethod {
    // how to use static method
    public static void main(String[] args) {
//        MyMath math = new MyMath();
//        int total = math.sum(10, 20);

        int total = MyMath.sum(10, 20);
//        Arrays.sort(); <- utility methods
//        Collections.reverse(); <- utility methods

        System.out.println("sum is: " + total);
    }
}
