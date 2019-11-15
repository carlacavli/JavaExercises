package day12.task;

import java.util.Scanner;

public class DoWhileTask3 {
    // task 1, check pin, pin should be 4 digit number
    // if it is not 4 digit number, print "incorrect pin"
    // hint: 999 < PIN < 10000
    // ex: 13123 => "incorrect pin"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin;
        do {
            System.out.println("please write pin");
            pin = scan.nextInt();

            if (pin <= 999 || 10000 <= pin) {
                // 123 => 999
                // 1233 => 10000
                /// 9999 + 1 => 10000

                System.out.println("Wrong combination, please use a 4 digit number");
            }
        } while (pin != 9999);

        System.out.println("take your card");
    }
}
