package day36.task;

// create array of size 5
// try to access to index 10

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[15];

        try {
            System.out.println(numbers[10]);
        }catch (Exception ex){
            System.out.println("Something happened");
        }
    }
}
