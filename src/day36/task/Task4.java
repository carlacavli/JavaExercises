package day36.task;

public class Task4 {

    public static Integer covertToInt(String number) {
        Integer integer = null;
        try {
            integer = Integer.valueOf(number);
        } catch (Exception ex) {
            System.out.println("cannot covert");
        }

        return integer;
    }

    public static void main(String[] args) {
        // fix the code
        System.out.println(covertToInt("one"));
        System.out.println(covertToInt("2"));
        System.out.println(covertToInt("-1"));
    }
}
