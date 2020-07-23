package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToList {
    public static void main(String[] args) {
          HashSet<String> hashset = new HashSet<String>();
     hashset.add("Pear");
    hashset.add("Apple");
    hashset.add("Orange");
    hashset.add("Papaya");
    hashset.add("Banana");
    System.out.println("HashSet contains :" + hashset);
    List<String> list = new ArrayList<String>(hashset);
     System.out.println("ArrayList contains :");
    for(String str : list){
        System.out.println(str);
    }
    }
}
