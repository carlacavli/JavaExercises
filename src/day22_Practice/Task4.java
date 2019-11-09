package day22_Practice;

public class Task4 {
    // 4. Write a Java program to test if an array contains a specific value
    // {1,23,34,45,34,645,6,45}
    // 34 ? yes i have : no i dont

    public static void main(String[] args) {
        int[] numbers = {1, 23, 34, 45, 34, 645, 6, 45};

        for (int num : numbers) { // for-each loop
            if(num == 34){
                System.out.println("I have it");
            }
        }


        // String[] s1 = {"", "abc"};
        // for(String anything : s1){
        //  anything = "";// first iteration
        //  anything = "abc";// second iteration
        // }
    }
}
