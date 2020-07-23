package collection;

import java.util.*;

public class HashSetToAL {
    public static void main(String[] args) {
        HashSet <Integer>hs=new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10);
        System.out.println(hs);
        List<Integer>list=new ArrayList<>(hs);
        System.out.println(list);
        for(int num : list)
            System.out.println(num);
        
    }
  
}
