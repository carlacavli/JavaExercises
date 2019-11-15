package day27.task;

public class Task11 {
    // write a java program that print array in this manner
    // using while loop
    // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    //part1:
    // 1 10
    // 2 9
    // 3 8
    // 4 7
    // 5 6
    // 6 5
    // 7 4
    // 8 3
    // 9 2
    // 10 1

    //part2:
    //  1 10
    //  2 9
    //  3 8
    //  4 7
    //  5 6

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int first = 0;
        int second = 9;

        while (first < 10) {
            System.out.println(arr[first] + " " + arr[second]);
            first++;
            second--;
        }


    }
}
