package day12.example;

import java.util.Scanner;

public class WhileEx3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("begin");
        while (true){
            System.out.println("Write text: ");
            String str = s.nextLine();

            if(str.equals("quit")){
                break;
            }
            if(str.length() >= 10){
                System.out.println("string is too large");
            }
        }

        System.out.println("end");
    }

}
