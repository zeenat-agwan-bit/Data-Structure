package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LLToArrayList {
    public static void main(String[] args) {
        List<Integer> linkedlist=new LinkedList<Integer>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        System.out.println(linkedlist);
        List<Integer>l=new ArrayList(linkedlist);
        for(int num: l)
        System.out.println(num);
    }
}
