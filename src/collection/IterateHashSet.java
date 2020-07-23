package collection;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
         HashSet<String> hs= new HashSet<String>();
        hs.add("zee");
        hs.add("ishi");
        hs.add("yusuf");
        hs.add("hina");
        System.out.println(hs);
          // Get iterator
    Iterator<String> it = hs.iterator();
    // Show HashSet elements
    System.out.println("HashSet contains: ");
    while(it.hasNext()) {
      System.out.println(it.next());
    }
     // Using for each loop
    for(String str : hs){
        System.out.println(str);
    }
    }
 
}
