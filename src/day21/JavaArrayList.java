package day21;

import java.util.ArrayList;


public class JavaArrayList {
    //    https://beginnersbook.com/2013/12/java-arraylist/
    public static void main(String[] args) {
        int a = 42;
        int b = a;

        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(4);
        input.add(41);
        input.add(5);
        input.add(8);
        input.add(34);

        boolean result = input.contains(5);

        if (input.contains(5)) {

        }
        String[] second = new String[]{"Steve", "John"};

        ArrayList<Integer> ab = new ArrayList<>();
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
//        alist.add(3, "John");
        alist.size();

        ArrayList<String> names = new ArrayList<>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");


        for (String name : names)
            System.out.println(name);

    //        int[] arr = {4, 5, 4, 3, 3, 6, 4};
    int[] arr = {1, 2, 3, 4, 5};
    int Indexposition = 2;
    int newvalue = 7;
        System.out.println(" original array: "+arr.toString());

        for(
    int i = arr.length - 1;
    i >Indexposition;i--)

    {
        arr[i] = arr[i - 1];

    }

    arr[Indexposition]=newvalue;
        System.out.println("new array"+arr.toString());
}
}
