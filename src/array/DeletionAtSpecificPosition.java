public class DeletionAtSpecificPosition{
public static void main (String args[]){
int arr[]={10,20,30,40,60,70,80,90};

int delete=70;
int count =0;
for(int i=0; i<arr.length;i++){
if(delete==arr[i]){
for(int j=i;j<arr.length-1;j++){

arr[j]=arr[j+1];
}
count=count+1;
break;

}

}
if(count==0){
System.out.println("Element Not Found");
}
else{
System.out.println("Element Deleted Successfully");
//length-1 bcz we dont need last element
for(int i=0;i<arr.length-1;i++){
System.out.println(arr[i]+ " " );
}


}




}}