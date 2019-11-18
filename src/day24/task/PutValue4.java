package day24.task;

import java.util.HashMap;

public class PutValue4 {
    // put letters as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
//        for (int i = 0; i < sentenceArray.length; i++) {
//
//        }
//        for (int i = 0; i <  sentence.length(); i++) {
//            sentence.charAt(i);
//        }
        for (char letter : sentenceArray) {
            letterMap.put(letter, 0);
        }
        System.out.println(letterMap);
    }
}
