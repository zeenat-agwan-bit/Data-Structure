package collection;
import java.util.*;
public class IterateHashMap1 {
public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("zee", 111);
        hm.put("ishi", 112);
        hm.put("yusuf", 113);
        hm.put("hina", 114);
        System.out.println(hm);
        
// Iterating or looping using keySet() method
    Set<String> keySet = hm.keySet();
    Iterator<String> keySetIterator = keySet.iterator();
    while (keySetIterator.hasNext()) {
        String key = keySetIterator.next();
        System.out.println( key + "____" + hm.get(key));
   }
    }
}
