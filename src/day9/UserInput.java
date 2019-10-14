package day9;

import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!!!");
        scan.close();

    }

    //TODO Task
    // 1. Write program that gets two inputs from user then prints sum
    // 2. Write simple calculator,
    //     a. reads first input
    //     b. reads operator (+, -, *, /)
    //     c. reads second input
    //     d. prints result
    // 3. Write program that calculates from string:
    //    ex: one plus nine => 10, four subtract 2 => 2


}
