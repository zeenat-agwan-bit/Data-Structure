public class BinarySearch{
public static void main(String args[]){
int arr[]={12,13,14,15,16,17,18,19,20};//list should be sorted
int item=9;
int lower=0;
int higher=arr.length-1;
int mid=(lower+higher)/2; //only int value accepted
while(lower<=higher){
if(arr[mid]==item){
System.out.println("item is at " +mid+ " index position");
break;
}
else if(arr[mid]<item){
lower=mid+1;
}
else{
higher=mid-1;
}
mid=(lower+higher)/2;
}
if(lower>higher)
{
System.out.println("element not found");
}



}}