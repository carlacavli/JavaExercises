package day1;

public class Program {
    //Instance variable
    int local = 10;

    //static: cannot create multiple copies
    //Only once instance of this variable.
    static int staticVariable = 45;

    //    inside the body of the method is called local variable.
    //static cannot have mulitple copies inside the memory
    public static void main(String[] args) {
        //Cannot be static
        int localA = 232;

    }

}

class A {

    int data = 45;//instance variable

    String example = "i have to put a text";
    static int m = 100;//static variable

    //void means it does not return anything.
    void method() {

        int n = 90;//local variable

    }


    public Boolean MyMethod() {
        return false;
    }

    public String MyMethod3() {
        return "you have to return a string";
    }
}//end of class



