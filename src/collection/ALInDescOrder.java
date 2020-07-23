package collection;

import java.util.*;

public class ALInDescOrder {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("zee");
        names.add("ishu");
        names.add("mini");
        names.add("yuyu");
        System.out.println("ArrayList Before: " + names);
        for (String str : names) {
            System.out.println(str);
        }
        //sort first then descending
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("ArrayList After: " + names);
        for (String str : names) {
            System.out.println(str);
        }
    }

}
