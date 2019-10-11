package day5;

public class DebugSession {
    public static void main(String[] args) {

        char aChar = '2';
        char A = 'A';
        char B = 'A' + 1;
        System.out.println(A);
        System.out.println(B);


        String courseName = "techno study";
        System.out.println(courseName);

        String printA = "letter is: " + A;
        System.out.println(printA);

        //techno study
        char c = courseName.charAt(2);
        String myVar = "tey";

        boolean name = courseName.startsWith("tey");
        boolean dy = courseName.endsWith("dy");

        boolean no = courseName.contains("no");

        int x = Integer.MAX_VALUE;
        int y = Integer.MIN_VALUE;


        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;

        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;
        int a = 9;
//        a = a + 1; //a++; same thing.
        a++;//after this line it will be? 9 + 1 = 10;
        a += 3; // 10+3 =13;
        a -= 10; // 13-10=3;
        a *= 2;// 3*2=6;
        a /= 4;// 6 / 4 =?????, why does equal 1.

        int num1 = 45;
        int num2 = 899;


        a--; //a= a - 1;
        a *= 2;
    }

}


class Main {
    public void main(String args[]) {
        int t = 4;//if I put a value, then it is runtime error
        //if I put no value, it will be compile error.
        System.out.println(t / 0);
    }
}
//(A) 0
//(B) garbage value
//(C) compiler error
//(D) runtime error

