package day8.example;

public class String1_Comparing {

    public static void main(String[] args) {
        String s1 = "YES";
        String s2 = "YES";

        if(s1 == s2){
            System.out.println("its equal");
        }

        String s3 = new String("YES");
        String s4 = new String("YES");

        if(s3.equals(s4)){
            System.out.println("its equal again");
        }

        String name = "Ali";
        if(name.equals("Max")){
            System.out.println("Hello");
        }

        String nameOfCourse = "TS";
        String otherString = "TS";
        if(nameOfCourse.equals(otherString)){ // "TS" is equal to "TS"
            System.out.println("You gonna be Tester after 6 months");
        }



//        summary
//        in String use .equals
        // in number(int, double, etc....) use ==
        // to check equality
    }
}
