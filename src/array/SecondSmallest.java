public class SecondSmallest{
public static void main(String args[]){
int a[]={3,5,7,8,4,9,11};
int temp;
//sort list in ascending order till 1 index and at 1th index we got the second smllest element
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
if(i==1){
break;
}
}
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" " );
}

System.out.println("Second smallest element is " +a[1]);
}


}