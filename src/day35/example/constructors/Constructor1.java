package day35.example.constructors;

public class Constructor1 {

    int value;

    public Constructor1(int val) {
        value = val;
    }

    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1(5);
        System.out.println(c1.value);
    }
}
