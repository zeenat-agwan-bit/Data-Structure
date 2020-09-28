public class AnonomousArray{

static void sum(int[][] no){
int total=0;
for(int arr[]: no){
for(int i : arr) 
{
total=total+i;
}
System.out.println(total);
}
}

public static void main (String args[]){

AnonomousArray.sum(new int[][] {{10,20,30},{10,20,30}});

}  
}