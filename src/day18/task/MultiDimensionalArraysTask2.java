package day18.task;

public class MultiDimensionalArraysTask2 {
    //TODO Using 2D Array fill the table of exam(examResult array)
// exam is provided with percentages 0-100%
//              JAVA	Math	English  C++   SoftSkills
//    Max	    ???	    ???	     ???
//    Bayram	???	    ???	     ???     ???    ???
    //part1. give number
    //part2, print all results, USING NESTED LOOP
    //part2.1, assign random numbers to results
    public static void main(String[] args) {
        //part1
        int[][] examResult = {
                {100, 100, 100},
                {100, 100, 100, 100, 100}
        };
        //part2
        System.out.println("Length: " + examResult[0].length);
        for (int row = 0; row < examResult.length; row++) {
            for (int col = 0; col < examResult[row].length; col++) {
                //part2.1
                examResult[row][col] = 30;
                System.out.print(examResult[row][col] + " ");
            }
            System.out.println();
        }
    }
}
