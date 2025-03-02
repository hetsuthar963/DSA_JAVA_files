import java.util.*;

public class iteration_HashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Canada", 40);
        hm.put("Australia", 30);
        hm.put("Nepal", 5);

        //Iteration logic -> using keySet or entrySet
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys = "+k+ ", value = "+hm.get(k));
        }
    }
}