public class FindMaxNumber{
public static void main(String args[]){
int a[]={3,5,7,8,4,9,11};
int max=a[0];
for(int i=1;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
}
System.out.println("Max is " +max);
}
}