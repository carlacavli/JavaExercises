package day35.homework;

//create a class
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it

class Cat1{
   public String eyecolor;
   public String gender;
   public int Age;
   public String Color;
   public  String Breed;
   public  boolean Friendly;
   public String Name;

   public Cat1(String name ,String eyeclr ,int age,String gndr,String breed, String color,boolean friendly){
       Name= name;
       eyecolor= eyeclr;
       Age=age;
       gender=gndr;
       Color= color;
       Breed= breed;;
       Friendly= friendly;

   }

   public String getCatsInfo(){

       return "name is: "+Name +"\n"+
               "gender is: "+gender +"\n"+
               "age is: "+Age+"\n"+
               "color is: "+Color+"\n"+
               "origin is: "+Breed+"\n"+
               "it is friendly: "+Friendly+"\n";
   }
    }



public class HW3 {
    public static void main(String[] args) {

        Cat1 cat= new Cat1("PABLO", "green", 1,
                "male", "persian", "grey", true);
        System.out.println(cat.getCatsInfo());
    }

}
