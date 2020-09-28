import java.util.*;

public class FindEvenAndOddInt{

public static void main(String args[]){
int sum=0;
int sum1=0;
int []arr={1,2,3,4,5,6,7,8,10};
ArrayList <Integer>al1=new ArrayList<>();
ArrayList<Integer>al2=new ArrayList<>();

for(int i=0;i<arr.length;i++){
if(arr[i]%2==0){
al1.add(arr[i]);
}
else{
al2.add(arr[i]);
}

}
System.out.println("Even numbers Are : ");
for(int num : al1){
System.out.println(num);

}
System.out.println("Number of Even :"+al1.size());

System.out.println("Odd numbers Are : ");
for(int num : al2){
System.out.println(num);

}
System.out.println("Number of Odd :"+al2.size());
System.out.println("--------------------Sum of Even And Odd----------------------");

for(int total: al1){
sum=sum+total;
}
System.out.println("Sum of Even :"+sum);

for(int total: al2){
sum1=sum1+total;
}
System.out.println("Sum of Odd :"+sum1);

} 
}