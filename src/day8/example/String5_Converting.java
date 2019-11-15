package day8.example;

public class String5_Converting {

    public static void main(String[] args) {
        // valueOf() which can be used to convert
        // a number to a String
        // Converting integer to String
        int number = 10;
        String s1 = String.valueOf(number);
        System.out.println(s1 + 10); //"10" + 10 => 1010
        System.out.println("10" + 10); //"10" + 10 => 1010
        System.out.println(number + 10); // 20

        System.out.println("---------------------------------------");
        // Converting String to integer
        String s2 = "30";
        int n2 = Integer.valueOf(s2);
        // 30 + 10 => 40
        System.out.println(s2+10); // "30" + 10 => "3010"
        System.out.println(n2+10); // 30 + 10 => 40


    }
}
