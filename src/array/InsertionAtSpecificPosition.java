public class InsertionAtSpecificPosition{
public static void main (String args[]){
int arr[]={10,20,30,40,60,70,80,90};
//1.position
//2.index position
int pos=3;
//int index_pos=3;
int element=50;
//for(int i=arr.length-1;i>pos;i--)
for(int i=arr.length-1;i>pos-1;i--){
arr[i]=arr[i-1];

}
arr[pos-1]=element;
//arr[pos]=element;
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}


}}