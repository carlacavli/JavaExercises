package day35.example.accessModifiers;

class Car {
    public String name;
    private String serialNumber;

    public String getAttributes(){
        return "Car name" + name;
    }
}

public class Example1 {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.name = "BMW";
        // bmw.serialNumber = "128y3812";

    }

}
