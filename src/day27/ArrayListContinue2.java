package day27;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContinue2 {
    public static void main(String[] args) {
//
        String s1 = "tahsin";
        String s2 = "TaHsin";

        boolean check = s1.equalsIgnoreCase(s2);
        System.out.println(s1 + " " + s2);


//        String s1 = "https://" +
//                "amazon.com" +
//                "/item/2837847/edit";
//        String[] array = s1.split("amazon.com");
//        for (String s : array) {
//            System.out.println(s);
//        }

//        System.out.println("Numbers:" + array[4]);


//
//        boolean[] b1 = new boolean[100];
//        for (boolean currentValue : b1) {
//            currentValue = b1[0]; // it. 1
//            currentValue = b1[1]; // it. 2
//            currentValue = b1[2]; // it. 3
//            ///
//        }


//        char[] charArray = new char[s1.length()];
//        charArray[0] = 'H'; A
//        charArray[1] = 'e';
//        charArray[2] = 'l';
//        charArray[3] = 'l';
//        charArray[4] = '0';
//        char[] charArray = s1.toCharArray();
//        charArray[0] = 'A';
//        System.out.println(s1);
//        System.out.println(charArray);


//        char c = s1.charAt(0);
//        Character c1 = s1.charAt(0);
//        System.out.println(s1.charAt(4) + " " + s1.charAt(8));
//
//        int length = s1.length();
//        System.out.println(length); // gives length of your string
//        System.out.println(s1);
//
//        String trimmedS1 = s1.trim();
//        System.out.println(trimmedS1); //removes leading and trailing whitespaces

        int[] array = {1, 5, 3, 100, 33, 10};
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();

        Arrays.sort(array);
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println("\nList-------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(1);
        System.out.println(list);
//        Collections.sort(list);
        System.out.println(list);



        //        Comparator<Integer> comparator = null;
//        list.sort(comparator);
//        Collections.sort(list, comparator) ;
    }
}
