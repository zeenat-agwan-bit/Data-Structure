public class FindMinNumber{
public static void main(String args[]){
int a[]={3,5,7,8,4,9,11};
int min=a[0];
for(int i=1;i<a.length;i++){
if(a[i]<min){
min=a[i];
}
}
System.out.println("Min is " +min);
}
}