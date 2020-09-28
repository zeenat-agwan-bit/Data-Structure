import java.util.*;
public class DuplicateElementBySET{
//faster than brute force
public static void main(String args[]){
int []arr={12,78,34,7,34,10,12};
System.out.print("Duplicate Values Are : ");

Set<Integer> s=new HashSet<>();
for(int num : arr){
boolean b=s.add(num);
if(b==false){
System.out.print(num+" ");
}
}

}
}