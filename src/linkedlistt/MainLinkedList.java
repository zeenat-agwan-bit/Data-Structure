package linkedlistt;

import java.util.*;

public class MainLinkedList {

    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        getTimeDiff(al);//slow
        getTimeDiff(li); //fast
    }

    static void getTimeDiff(List<Integer> list) {
        long start = System.currentTimeMillis();
      
        for (int i = 0; i < 100000; i++) {
            list.add(0,i); //insertion at 0th index
        }
          long end = System.currentTimeMillis();
      
       System.out.println(list.getClass().getName()+"------------"+(end-start));
    }
}
