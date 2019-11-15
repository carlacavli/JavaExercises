package day8.example;

public class String2_Length {
    public static void main(String[] args) {
        //String Length
        String s1 = "ABCDE";
        System.out.println(s1.length());

        int length = s1.length();
        System.out.println(length);
        String username = "techno.study";

        if(username.length() < 10){
            System.out.println("you can login");
        }
        if(username.length() >= 10){
            System.out.println("you cannot login");
        }

    }
}
