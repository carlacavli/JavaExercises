package day8.example;

public class String6_IndexOf {
    // Searching in Strings With indexOf()
    public static void main(String[] args) {

        System.out.println("EX 1---------------------------");
                   //01234
        String s1 = "Hello";
        System.out.println(s1.indexOf("llo"));

        System.out.println("EX 2---------------------------");
        //indexOf get first occurrence of your searching string
        String s2 = "Techno Study";
        int indexS2 = s2.indexOf("ech");
        System.out.println(indexS2);

        System.out.println("EX 3---------------------------");
        //lastIndexOf get last occurrence of your searching string
        String s3 = "so something so many";
        int indexS3 = s3.lastIndexOf("so");
        System.out.println(indexS3);


    }

}
