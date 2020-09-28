public class LinearStringSearch
{
public static void main(String args[])
{
String [] arr={"zee","yuyu","mani"};
String item="mani";
int temp=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i].equals(item))
{
System.out.println("item present at "+ i +" posion");
temp=temp+1; //if item not present then temp never be increase.
}
}
if(temp==0)
{
System.out.println("item not present");
}
}
}