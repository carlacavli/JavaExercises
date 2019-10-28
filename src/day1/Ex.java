package day1;

import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide the first number:");
        int i1 = Integer.valueOf(scan.nextLine());
        System.out.println("Provide the second number:");
        int i2 = Integer.valueOf(scan.nextLine());

        int sum = i1 + i2;
        int sub = i1 - i2;
        int mul = i1 * i2;
        double div = (double)i1 / i2;

        System.out.println("Provide the operand:");
        String op = scan.nextLine();

        switch (op) {
            case "+":
                System.out.println("sum is" + sum);
                break;
            case "-":
                System.out.println("sub is" + sub);
                break;
            case "*":
                System.out.println("mul is" + mul);
                break;
            case "/":
                System.out.println("div is" + div);
                break;
            default:
                System.out.println("invalid");

        }


    }
}
