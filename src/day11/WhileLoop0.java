package day11;

public class WhileLoop0 {
    public static void main(String[] args) {
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

        boolean b = true;
        int i = 1;
        while(b){
            System.out.println(i);
            if(i == 5){
                b = false;
            }
            i++;
        }

    }
    //same thing with for loop
    public static void main2(String[] args)
    {

        int x = 1;

        // Exit when x becomes greater than 4
        while (x <= 4) {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            x++;
        }
        // for loop begins when x=2
        // and runs till x <=4
//        for (int x = 2; x <= 4; x++)
//            System.out.println("Value of x:" + x);
    }
}
