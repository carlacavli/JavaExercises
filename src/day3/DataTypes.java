package day3;

public class DataTypes {
    public static int myNumber = 9;
    public static char myLetter = 'b';
    //ctrl + wheel of the mouse
    public static void main(String[] args) {
        int myNumber = 10;
        //short
        //long
        //byte
        float myFloatNum = 883.34f;
        //double
        myLetter = 'a';
        boolean myBool = false; // true false
        byte minByte = - 128;
        byte maxByte = 127;
//
//        int a = 2147483647;
//        int b = 2147483647;
//
//        System.out.println(result);
        // task 1. add a and b, print result
        // 4294967294

        int a = 10;
        int b = 3;

        //float result =  a / b;
        // result = 10 / 3 => 3

        float result = (float) a / (float) b;
        // result = 10.0 / 3.0 => 3.333333333333
        System.out.println(result);
        // task 1. divide a and b, print result
        // Hint: long result = (long)a + (long)b;
        // 3.33333333333


        // task 2.
        // declare three integers and print the average:
        // a, b, c (a = 5, b= 3, c= 2)
        // output:
        // (a+b+c)/3 = 3.33333333333
        a = 5;
        b = 3;
        int c = 2;

        result =  (float)(a + b + c)/3;
        System.out.println("(a+b+c)/3 = "+result);


        int r = (a + b + c);
        float floatResult = r/3;
        System.out.println("(a+b+c)/3 = "+floatResult);

        // task 3
        //   do some math, get average of several numbers
        //   ex: 23.4, 24.0, 12, 450.3, 123000.234

//        int result = maxByte + 1;
//        System.out.println(result);


//        int minInteger = -2147483648; //-something ---- something
//        int maxInteger =  2147483647; //-something ---- something
//                         //2147483648
//
//        long larger = maxInteger + 1L; // 2147483647 + 1L
//        System.out.println(maxInteger + 1);
//        System.out.println(larger);
    }

}
