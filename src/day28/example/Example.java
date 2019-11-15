package day28.example;

public class Example {
    public static void main(String[] args) {
        boolean haveOne = false;
        int a = 5;

        if ((a = 11) > 10) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
