package day16;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//rows and columns
//  12345
//a *****
//b *****
//c *****
//d *****
//e *****

// 1,2,3,4,5 are columns
// a,b,c,d,e are rows
