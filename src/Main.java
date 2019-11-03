import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Techno Study");

        HashMap<String, Integer> m = new HashMap<>();
        m.put("Apple", 100);
        m.put("Lemon", 200);
        TreeMap<String, Integer> t = new TreeMap<> (m);
        TreeMap<String, Integer> t1 = new TreeMap<>(t);
        t1.remove("Apple" , 100);

        System.out.println(t1);
        System.out.println(t);
    }
}


