public class KthSmallest{
public static void main(String args[]){
int []arr={12,78,34,7,32,10};
int k=4; //where 4 is 4th index value
for(int i=0;i<arr.length-1;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]<arr[j]){  //ascending order
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
if(i==k-1){
System.out.println(k + " Smallest element is " +arr[i]);
break; //only 4 elements will be sort 
}

}
System.out.println("----------------------------------");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]+" ");

}
}}