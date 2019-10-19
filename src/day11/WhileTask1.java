package day11;

import java.util.Scanner;

public class WhileTask1 {
    // Part1, write a program which asks you to provide a text
    // and it should stop when you type "quit"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");
        String s = scan.nextLine();

        while (!s.equals("quit")) { //s != "exit"
            System.out.println("Write a string");
            s = scan.nextLine();
        }
    }


}
