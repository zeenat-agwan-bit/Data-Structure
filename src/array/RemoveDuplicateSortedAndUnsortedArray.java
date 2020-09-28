import java.util.*;
public class RemoveDuplicateSortedAndUnsortedArray{
public static void main(String[]args){
int arr[]={1,3,2,3,4,5,7,5,5};
HashSet<Integer>hs=new HashSet<>();
for(int i=0;i<arr.length;i++){
hs.add(arr[i]);
}
for(int num: hs ){
System.out.print(num+" ");
}



}

}