import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(23455);
        numbers.add(23442);
        numbers.add(823443284);
        numbers.add(34247230);
        numbers.add(3103425);
        numbers.add(75685);

        int sum = printSum(numbers);

        System.out.println(printSum(numbers));
    }
    public static int printSum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int num:numbers) {
            sum+=num;
        }
        return sum;
    }
}


