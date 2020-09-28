import java.util.*;
public class AppearsOnce{
//XOR (only for one duplicate for multiple ,go for collections) 
public static void  main(String[]args){
int a[]={1,5,1,6,6,3,3,2,4,4}; 
int res=a[0];
for(int i=1;i<a.length;i++) //key point i=1
{
res=res ^ a[i];
}
System.out.print("element is: " +res);
}
}