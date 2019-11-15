package day17.example;

public class NestedLoopExercise1 {
    // Exercise, shown why nested loops are important
    // For example think about amazon,
    // has category => Automotive Parts and Accessories
    // has items as =>  Wheel
    //                  Performance Parts
    //                  Tires & Wheels
    //                  Interior Accessories
    //                  Exterior Accessories
    //                  Car Care
    //                  Tools & Equipment
    //                  Truck Parts & Accessories
    //has details as => General Grabber AT2 Radial
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("category: " + i); // Automotive Parts and Accessories
            for (int j = 0; j < 10; j++) {
                System.out.println("item: " + j + " of category: " + i); // Wheel
                for (int k = 0; k < 5; k++) {
                    System.out.println("detail: " + k + " of item: " + j); // General Grabber AT2 Radial
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
