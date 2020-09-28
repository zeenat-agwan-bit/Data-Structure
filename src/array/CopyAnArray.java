package array;

public class CopyAnArray{
public static void main(String args[]){
int arr[]={1,2,3};

//System.arraycopy(arr,0,arr_copy,0,arr.length);

int arr_copy[]=new int [arr.length];

arr_copy=arr;

for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
for(int i=0;i<arr_copy.length;i++){
System.out.println(arr_copy[i]);
}
}
}