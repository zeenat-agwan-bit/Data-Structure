package collection;
import java.util.*;
public class IterateHashMap {
public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("zee", 111);
        hm.put("ishi", 112);
        hm.put("yusuf", 113);
        hm.put("hina", 114);
        System.out.println(hm);
        //for loop
        for (String key : hm.keySet()) {
            System.out.println(key + "------" + hm.get(key));
        }
    }
}
