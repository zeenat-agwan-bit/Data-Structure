import java.util.*;
public class FirstDuplicateElement2{
//efficient
public static void  main(String[]args){
int a[]={1,5,6,3,2,5,4,4};
int temp=-1;
HashSet<Integer>hs=new HashSet<>();
for(int i=a.length-1;i>=0;i--){

if(hs.contains(a[i])){
temp=i;
}
else{
hs.add(a[i]);
}
}
if(temp!=-1){
System.out.print("First Dulicate element is " +  a[temp]);
}
else{
System.out.print("First Dulicate element not present");
}
}
}