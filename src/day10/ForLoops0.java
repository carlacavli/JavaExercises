package day10;

public class ForLoops0 {

    public static void main(String[] args) {
        int x = 6;
        x--; //which means the same thing as x = x - 1;
        x++; //which means the same thing as x = x + 1;

        x += 2; //which means the same thing as x = x + 2;
        x -= 2; //which means the same thing as x = x - 2;

        x += 3; //which means the same thing as x = x + 3;

        //i++ means the same thing as i = i + 1;
        //i

        //Task is to print even numbers from 1 to 10
        //use for statement and use i = i + 1
        // or i = i + 2 (if you start from zero)
        //OUTPUT: 2,4,6,8,10
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);//Here output is 0,2,4,6,8,10
        }
        System.out.println("to separate ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);//Here output is 2,4,6,8,10
        }


        //Task is to print 10,9,8,7,6,5,4,3,2,1
        for (int y = 10; y > 1; y = y - 1) {
            System.out.println(y);
        }


        //this one is prints from 1,2,3,4,5,6,7,8,9,10
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }
}


//
//    //Task is to print in loop 5, 4, 3, 2, 1
//    private static void forLoopExample() {
//
////        i++ is the same thing as i = i + 1;
//        for (int i = 5; i <= 6; i++) {
//            System.out.println("i is: " + i);
//        }
//        System.out.println("blank separator");
//
////        Faris
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }
//    }
//
//    public static void main4356(String[] args) {
//
//        for (int bigI = 0; bigI < 5; bigI++)
//            System.out.println("i is: " + bigI);
//
//        System.out.println("Print again the i values, with different condition");
//
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("i is: " + i);
//        }
//    }
//}
