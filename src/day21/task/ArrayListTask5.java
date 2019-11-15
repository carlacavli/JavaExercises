package day21.task;

import java.util.ArrayList;

public class ArrayListTask5 {
    //5. Write a Java program to update specific array element by given element.
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red"); // 0
        colors.add("White");// 1
        colors.add("Black"); // 2
        colors.add("Green");
        System.out.println(colors);
        //Hint: for example change black to blue
        // Black => Blue
        // .set(index, value);
        colors.set(2, "Blue");
        System.out.println(colors);
    }
}
