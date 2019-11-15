package day8.example;

public class String7_Trim {
    //trim() is meant to remove
    //       white space characters at the beginning and end of the string
    public static void main(String[] args) {
        String string = "   Hello       ";
        System.out.println(string);
        System.out.println(string.trim());

        String s2 = "   Hello  World     ";
        System.out.println(s2.trim());

    }
}
