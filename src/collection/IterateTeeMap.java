
package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateTeeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treemap = new TreeMap<String, String>();
    treemap.put("1", "Pear");
    treemap.put("2", "Apple");
    treemap.put("3", "Orange");
    treemap.put("4", "Papaya");
    treemap.put("5", "Banana");
    
    
    // Get Set of entries
    Set set = treemap.entrySet();
    // Get iterator
    Iterator it = set.iterator();
    // Show TreeMap elements
    System.out.println("TreeMap contains: ");
    while(it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      System.out.print("Key is: "+pair.getKey() + " and ");
      System.out.println("Value is: "+pair.getValue());
    }
    }
}
