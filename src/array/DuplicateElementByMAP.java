import java.util.*;
public class DuplicateElementByMAP{
//Effective way
public static void main(String args[]){
int []arr={12,78,34,7,34,10,12};
System.out.print("Duplicate Values Are : ");

Map<Integer,Integer> hm=new HashMap<>();
for(int num : arr){
Integer count =hm.get(num); //returns integer
if(count==null){
hm.put(num,1);
}
else{
count =count+1;
hm.put(num,count);
}
}
System.out.print("Duplicate Elements Are : ");
Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
for(Map.Entry<Integer,Integer> me : es){
if(me.getValue()>1){
System.out.print(me.getKey()+" ");
}
}
}
}