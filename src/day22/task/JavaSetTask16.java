package day22.task;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSetTask16 {
    //16. You have list of numbers, determine if you have duplication there
    //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
    //ex2: [1, 2, 3] => no duplications
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list + " size:" + list.size());

        // 1, 1, 2, 3....
//        HashSet<Integer> mySet = new HashSet<>(list);
//        System.out.println(mySet + " size:" + mySet.size());
//
//        System.out.println("1. way");
//        if (list.size() != mySet.size()) {
//            System.out.println("has duplications");
//        } else {
//            System.out.println("no duplications");
//        }

        // 1, 1, 2, 3....
        System.out.println("2. way");
        HashSet<Integer> mySet = new HashSet<>();
        for (Integer number : list) {
            if(mySet.contains(number)){
                System.out.println("Set already has this number: " + number);
                break;
            }else {
                mySet.add(number);
            }
        }

    }
}
