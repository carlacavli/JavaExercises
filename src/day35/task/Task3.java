package day35.task;


class User {
    private int age(){
        return 20;
    }

    public String printUser(){
        return "User | " + age();
    }

}

public class Task3 {
    // create class
    // create private method
    // use public method to access to private method

    public static void main(String[] args) {
        User student = new User();
        //student.age(); <-0 can not call it like this, because it is private method
        System.out.println(student.printUser());
    }
}
