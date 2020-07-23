package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToTreeSet {
    public static void main(String[] args) {
       Integer [] num={7,6,71,2,3,4,5,4,4,6,7,8};
       
       /*First we convert an Array to List using
      Arrays.asList(), then pass the list as an
      argument to the constructor of TreeSet */
       
  List<Integer>list=Arrays.asList(num);
  Set<Integer>set=new TreeSet<Integer>(list);
  //show set elements
        System.out.println("The set elements are :");
        for(int var : set){
            System.out.println(var);
    }
}
}
