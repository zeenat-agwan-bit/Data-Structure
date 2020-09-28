public class DuplicateElementBruteForce{
//not applicable for more than 2 duplicate elements
//poor performance(slow)
public static void main(String args[]){
int []arr={12,78,34,7,12,10};
System.out.print("Duplicate Values Are : ");

for(int i=0;i<arr.length-1;i++)
{

for(int j=i+1;j<arr.length;j++)
{

if((arr[i]==arr[j]) && (i!=j))
{
System.out.print(arr[j]+" ");

}


}
}
}
}