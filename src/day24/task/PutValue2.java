package day24.task;

import java.util.HashMap;

public class PutValue2 {
    // Put Strings into map as keys, and print you map
    public static void main(String[] args) {
        String[] manyName = {"Max", "Drake", "Susan"};
        //write you code here
        HashMap<String, Integer> technoStudy = new HashMap<>();
        for (String singleName : manyName) {
            technoStudy.put(singleName, 0);
        }
        //end of you code
        System.out.println(technoStudy);
        //output:
        //{Max=0,Drake=0,Susan=0}

    }
}
