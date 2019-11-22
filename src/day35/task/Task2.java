package day35.task;

//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in Task 2 class create at least 4 object on that class
// call method to get attributes and print it
public class Task2 {
    public static void main(String[] args) {
        Bank chase = new Bank(2010, 1, "Chase");
        System.out.println(chase.printOut());
        System.out.println("------------------------------------");

        Bank bank = new Bank();
        bank.trustworthiness = true;
        bank.name = " some name";
        bank.year = 210;
        System.out.println(bank.printOut());
        System.out.println("------------------------------------");

        Bank trustworthyBank = new Bank(true);
        System.out.println(trustworthyBank.printOut());
        System.out.println("------------------------------------");

        Bank td = new Bank(2005, 101010, "TD", true);
        System.out.println(td.printOut());

    }

}
