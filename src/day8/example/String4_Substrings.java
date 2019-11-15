package day8.example;

public class String4_Substrings {

    //Substrings
    public static void main(String[] args) {
                        //0123456789101112
        String string1 = "Hello World";
        System.out.println(string1.substring(10, 11));

                          // provide beginning index
        System.out.println(string1.substring(6)); // World
                          // provide beginning index and index where to stop
        System.out.println(string1.substring(0,1)); // H
        System.out.println(string1.substring(6,7)); // W

        System.out.println(string1.substring(11, 11)); //
        System.out.println(string1.substring(0)); // Hello World

        System.out.println("----------------------------------------");
        //Task 1:
        // write a program that prints your initials
        // ex: Michale Jackson => MJ
        String fullname = "Michale Jackson";
        String a = fullname.substring(0,1);
        String b = fullname.substring(8,9);
        System.out.println(a+b);

        //Task 2: continue "task 1" but print this:
        // ex: Michale Jackson => M.J.
        String dot = ".";
        System.out.println(a+dot+b+dot);

        //Task 3: Write a Java program to get a substring
        //        of a given string between two specified positions
        //given string: "The quick brown fox jumps over the lazy dog."
        //print only this:   "brown fox jumps"

        String s1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(s1.substring(10, 25));
    }
}
