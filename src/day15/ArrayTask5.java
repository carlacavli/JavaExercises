package day15;

public class ArrayTask5 {
    //TODO
    // Given 2 arrays of ints, a and b,
    // part1. if they have the same first element print => "have the same first elements"
    // part2. if they have the same last element print => "have the same last elements"
    // part3. if they have the same middle element print => "have the same middle elements"
    // part4. check every element, if they are same print => "arrays are same"

    public static void main(String[] args) {
        //HINT:
        //create two arrays, fill it with numbers
        //check numbers at index 0
        //         0   1   2   3   4   5
        int[] a = {10, 20, 25, 60, 50, 30}; // length = 6
        //          0   1   2
        int[] b = {10, 60, 30}; //length = 3 => 3-1 =>2
        //part 1
        System.out.println("Part1------------------------");
        if (a[0] == b[0]) {
            System.out.println("have the same first elements");
        }
        //part 2
        System.out.println("Part2------------------------");
        int lengthOfA = a.length; //6-1 =>5
        int lengthOfB = b.length; //3
        if (a[lengthOfA - 1] == b[lengthOfB - 1]) {
            System.out.println("have the same last elements");
        }
        //part 3
        System.out.println("Part3------------------------");
        if (a[lengthOfA / 2] == b[lengthOfB / 2]) {
            System.out.println("have the same middle elements");
        }

        // part4. check every element, if they are same print => "arrays are same"
        //ex:
        // a = {5, 6, 7}
        // b = {5, 6, 7}
        // => "arrays are same"
        //ex2:
        // a = {3, 2, 6}
        // b = {5, 6, 7}
        // => "arrays are different"
    }
}
