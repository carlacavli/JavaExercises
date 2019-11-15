package day8.example;

public class String3_UppercaseAndLowercase {
    // You can convert Strings to uppercase and lowercase
    // using the methods toUpperCase() and toLowerCase()

    public static void main(String[] args) {
        String s1 = "techno study";
        //to convert to uppercase TECHNO STUDY use toUpperCase();
        System.out.println(s1.toUpperCase());

        System.out.println("-------------------------");
        String s2 = "HeLLo WoRlD";
        System.out.println(s2); // HeLLo WoRlD
        System.out.println(s2.toUpperCase()); // HELLO WORLD,  to make it UPPERCASE

        System.out.println(s2.toLowerCase()); // hello world, to make it lowercase
    }
}
