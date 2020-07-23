package collection;
import java.util.*;
public class IterateHashMap2 {
public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("zee", 111);
        hm.put("ishi", 112);
        hm.put("yusuf", 113);
        hm.put("hina", 114);
        System.out.println(hm);
        
// Iterating or looping using entrySet() method

    Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
    for (Map.Entry entry : entrySet) {
        System.out.println( entry.getKey() + " ____ " + entry.getValue());
     
}
    }
}
