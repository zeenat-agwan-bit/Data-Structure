public class FindIndexOfArrayElement{
public static void main(String args[]){
int arr[]={1,2,3,4,5};
int count=0;
int item=2;
for(int i=0;i<arr.length;i++){
if(arr[i]==item){
count =i;
System.out.println(count);
}

}


}
}