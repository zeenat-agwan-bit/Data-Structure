package array;

import java.util.*; 
public class LongestSubsequence{
public static void main (String args[]){
int arr[]={3,9,1,10,4,20,2};
//1
HashSet <Integer>hs=new HashSet <>();

for(int i=0;i<arr.length;i++){
hs.add(arr[i]);
}
int longestLength=0;
//2
for(int i=0;i<arr.length;i++){
if(!hs.contains(arr[i]-1))
{
int num=arr[i];

while (hs.contains(num)){

num++;
}
if(longestLength < num-arr[i]){
longestLength=num-arr[i];

}
}
}
System.out.println(longestLength);
}
}