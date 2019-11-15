package day12.example;

import java.util.Scanner;

public class WhileEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");
        String s = scan.nextLine();

        while (!s.equals("o")) { //s != "exit"
            System.out.println("Write a string");
            s = scan.nextLine();
        }
    }

    // Part1, write a program which asks you to provide a text
    // and it should stop when you type "quit"

    // Part2, continue part1 but also check for length() of string
    // if length is bigger than 10, program should say that string is too large
    // ex:
    // in the while loop....
    //     wjherjwhejrhwejrh => "string is too large"

    // medium:
    // rewrite task with for loop
}
