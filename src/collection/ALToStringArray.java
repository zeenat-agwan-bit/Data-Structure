package collection;
import java.util.ArrayList;
import java.util.List;

public class ALToStringArray {
    public static void main(String[] args) {
       List list=new ArrayList();
       list.add("zee");
       list.add(20);
       list.add(30);
       list.add("yuyu");
       list.add(50);
        System.out.println(list);
        Object[] num=new Object[list.size()];
for(int i=0;i<list.size();i++){
    num[i]=list.get(i);
}
for(Object k: num){
    System.out.println(k);
}
    }
 
}
///*ArrayList to Array Conversion */
 // String citinames[]=cities.toArray(new String[cities.size()]);
