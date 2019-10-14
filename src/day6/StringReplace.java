package day6;

public class StringReplace {

    // The replace() method does not actually replace characters in the existing String. Rather, it returns a new String instance which is equal to the String instance it was created from, but with the given characters replaced.
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1.replace("o","@"));

        //replace "one" with "four"
        String s2 = "one two one three";
        System.out.println(s2.replace("one","four"));

        String s3 = "name;surname;age;grade;class";
        System.out.println(s3.replace(";"," "));

        //task1:
        // write a program that replace your name with your surname
        // using .replace()
        // ex: Michale => Jackson
        String s4 = "Zeynep";
        String s5 = s4.replace("Zeynep","Ucar");
        System.out.println(s5);
        System.out.println(s4);

    }

}
