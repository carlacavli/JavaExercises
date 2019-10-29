package day17;

public class Homework {
//         walmart	costco	corrado's	AVG
//    apple	3	       4	   5	     4
//    milk	3	       3	   3	     3
//    meat	4          5	   4	     4.33
//    bread	1	       1	   2	     1.33
//    TOTAL	11	      13	   14

    // given table,
    // part1. calculate sum of price in each market(walmart,costco,corrado's)
    // expected output is:
    // Total at Walmart is: ???
    // Total at costco is: ???
    // Total at corrado's is: ???

    // part2. calculate average price of each item(apple, milk, meat, bread)
    // expected output is:
    // average price of apple is: ???
    // average price of milk is: ???
    // average price of meat is: ???
    // average price of bread is: ???

    public static void main(String[] args) {
        int[][] prices = {
                {3, 4, 5 , 5},
                {3, 3, 3, 5},
                {4, 5, 4, 3},
                {4, 5, 4, 3},
                {1, 1, 2, 34}
        };
        String[] stores = {"Walmart", "Costco", "Corrados", "amazon"};
        String[] items = {"apple", "milk", "meat", "bread", "pepsi"};

//        int[] storeSum = new int[prices[0].length];
//        int[] itemAvg = new int[prices.length];


        System.out.println("AVG--------------------------------");
        for (int i = 0; i < prices.length; i++) {
            double avg = 0;
            for (int j = 0; j < prices[i].length; j++) {
                avg += prices[i][j];
            }
            avg /= prices[i].length;
            System.out.println(items[i] + " avg: " + avg);
        }

        System.out.println("SUM--------------------------------");
        for (int j = 0; j < prices[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < prices.length; i++) {
                sum += prices[i][j];
            }
            System.out.println(stores[j] + " sum: " + sum);
        }

    }
}


