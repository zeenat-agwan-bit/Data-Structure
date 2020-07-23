package collection;

import java.util.*;

public class ArrayToAL {
    public static void main(String[] args) {
        String [] states={"mp","mh","rj","gj"};
        
    ArrayList al=new ArrayList(Arrays.asList(states));
    al.add(10);
    al.add(20);
    for(Object ob: al){
        System.out.println(ob);
    }
      }
  
}
