package array;

import java.util.*;

public class KthLargestPriorityQueue{

public static int findkthLargest(int []arr,int k){

PriorityQueue<Integer>minHeap=new PriorityQueue<Integer>();
for(int i : arr){
minHeap.add(i);
if(minHeap.size() > k){
minHeap.poll();
}
}

//for(int i: arr){
//System.out.println(i);
//}
return minHeap.poll();
}

public static void main(String args[]){

int []arr={3,2,1,5,6,4};
System.out.println(KthLargestPriorityQueue.findkthLargest(arr,2 ));

}
}