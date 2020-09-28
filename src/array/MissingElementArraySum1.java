package array;

public class MissingElementArraySum1{
//Method1: Array Sum(for small inputs)
//Method 2:XOR
public static void main(String args[]){
//1+2+3+4+5=15
int arr[]={1,2,3,5};
int expected=arr.length+1;
int total_Sum=expected*(expected+1)/2; //5*6/2=15
/*
total num of elements :4
expected num of elements (including missing):5
*/
int sum=0;
for(int i=0;i<arr.length;i++){
sum=sum+arr[i];    //given elements sum

}
System.out.println("Missing Number is : "+(total_Sum-sum));

}

}