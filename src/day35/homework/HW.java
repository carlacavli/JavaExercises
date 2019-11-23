package day35.homework;

//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it
class Person1 {
    public String Pname;
    public int Page ;
    public boolean maners;
    public String eyecolor;

    public Person1 (boolean m){
        maners = m;
        m = true;
    }

     public Person1 ( int age,String name,boolean maners) {
         Pname = name;
         Page = age;
         maners = true;
     }
     public Person1(String eyecolor){
       eyecolor="green";

     }


    public String getAttributes(){
         return "name is " + Pname+"\n "+ "age is " + Page +"\n" +" nice person "
                 + maners+"\n"+ "eyecolor"+"\n"+eyecolor;
     }
}
public class HW {
    public static void main(String[] args) {
        Person1 person= new Person1(20, "ayse", true);
        Person1 maners = new Person1(true);
        Person1 eyecolor=new Person1("green");
        System.out.println(person.getAttributes());

    }
}
