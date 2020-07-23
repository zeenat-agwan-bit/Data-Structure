
package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm=new HashMap<String ,Integer>();
        hm.put("abc",10);
          hm.put("hello",11);
            hm.put("well",12);
              hm.put("come",11);
        System.out.println("Before Sorting :");
        Set set=hm.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            Map.Entry entry=(Map.Entry) it.next();
            System.out.print(entry.getKey()+":");
            System.out.println(entry.getValue());
        }
        Map<String,Integer>map=new TreeMap<>(hm);
        System.out.println("After sorting : ");
        Set set2=map.entrySet();
        Iterator it2=set2.iterator();
        while(it2.hasNext()){
            Map.Entry entry=(Map.Entry) it2.next();
            System.out.print(entry.getKey()+":");
            System.out.println(entry.getValue());
            
        }
    }
}
//collection notes through comparator