package day25;


public class Example {
    public static void main(String[] args) {
        day24.Example ex = new day24.Example();
        ex.PublicMethod();


        day24.Example.Number = 43;
        day24.Example.PublicStaticMethod();

    }

    public static void PublicStaticMethod(){

    }
}
