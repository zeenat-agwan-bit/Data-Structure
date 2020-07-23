package collection;

import java.util.*;

public class RemoveKeyInHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("zeenat", 111);
        hm.put("ishu", 112);
        hm.put("yuyu", 113);
        System.out.println(hm);
        hm.remove("yuyu");
        System.out.println(hm);

    }
}
