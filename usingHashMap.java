import java.util.*;

public class usingHashMap {
    public static void main(String args[]) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        // will o/p unordered data 
        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("India");
        // System.out.println("Population = "+population);

        // System.out.println("Population = "+hm.get("Nepal"));


        // //ContainsKey - O(1)
        // System.out.println(hm.containsKey("India")); 
        // System.out.println(hm.containsKey("Nepal")); 

        // removing value
        // System.out.println(hm.remove("Nepal"));
        // System.out.println(hm);

        //size of hashmap
        System.out.println(hm.size());

        //to clear hashmap
        hm.clear();

        //IS empty
        System.out.println(hm.isEmpty());

    }
}