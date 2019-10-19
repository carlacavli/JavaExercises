package day11;

import java.util.Scanner;

public class doWhileEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "";
//        while (!s.equals("o")) { //s != "exit"
////            System.out.println("Write a string");
////            s = scan.nextLine();
////        }

        do {
            System.out.println("Write a string");
            s = scan.nextLine();
        }while (!s.equals("o"));
    }
}
