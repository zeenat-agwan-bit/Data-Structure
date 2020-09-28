public class LinearSearch{
public static void main(String args[]){
int [] arr={1,5,6,7,9,3,5};
int item=19;
int temp=0;
for(int i=0;i<arr.length;i++){
if(arr[i]==item){
System.out.println("item present at "+ i +" posion");
temp=temp+1; //if item not present then temp never be increase.
}
}
if(temp==0){
System.out.println("item not present");
}
}
}