package day3;

public class SampleClass {
    public int myNumber = 9;


//    Given two strings, a and b,
//    return the result of putting them together in the order abba,
//    e.g. "Hi" and "Bye" returns "HiByeByeHi".
//
//
//    makeAbba("Hi", "Bye") → "HiByeByeHi"
//    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//    makeAbba("What", "Up") → "WhatUpUpWhat"
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 3;
        int result = 6 % 3;

        String f = "Yo";

        char onlyOneCharacter = 'a';
        int num = 54;
        String first = "Techno";
        String second = "PutAnyVariable";
        anyNameYouWant(first, second, num);
    }

    static void anyNameYouWant(String first, String second, Integer third) {
        System.out.println(first + second + second + first);
    }
}

