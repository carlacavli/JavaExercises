package day11;

public class WhileLoop0 {
    public static void main(String[] args) {
        int x = 1;

        // Exit when x becomes greater than 4
        while (x <= 4) {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            x++;
        }
    }
    //same thing with for loop
    public static void main2(String[] args)
    {
        // for loop begins when x=2
        // and runs till x <=4
        for (int x = 2; x <= 4; x++)
            System.out.println("Value of x:" + x);
    }
}
