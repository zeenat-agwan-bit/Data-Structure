package collection;
import java.util.*;
public class IterateHashMap3 {
public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("zee", 111);
        hm.put("ishi", 112);
        hm.put("yusuf", 113);
        hm.put("hina", 114);
        System.out.println(hm);
        

 // Iterating or looping using entrySet() method
    Set<Map.Entry<String, Integer>> entrySet1 = hm.entrySet();
    Iterator<Map.Entry<String, Integer>> entrySetIterator = entrySet1.iterator();
    while (entrySetIterator.hasNext()) {
        Map.Entry entry = entrySetIterator.next();
        System.out.println(entry.getKey() + "____" + entry.getValue());
  }
    }
}
