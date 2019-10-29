package day15;

public class Example1 {
    public static void main(String[] args) {
        // how to find 5 in loop
        boolean haveFive = false;
        for (int i = 6; i < 10; i++) {
            if (i == 5) {
                haveFive = true;
            }
        }
        if(haveFive) {
            System.out.println("you have 5 in array");
        }else{
            System.out.println("you dont have");
        }
    }
}
