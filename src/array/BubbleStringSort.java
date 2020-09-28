public class BubbleStringSort
{
public static void main(String args[])
    {
String[] a={"dam","aish","zee","mani","bani"};
String temp;
for(int i=0;i<a.length;i++)
     {
for(int j=0;j<a.length-1-i;j++)//length -1 to prevent  ArrayIndexOutOfBoundException//-i to exclude last ele which is on correct possition//1st round 1 ele ,2nd round 2 elem 3rd round 3 element will be excluded and so on....
{
if(a[j].compareTo(a[j+1]) >0)   //if greater then swap them
{ 
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}

    }

    }
for(int i=0;i<a.length;i++){
System.out.println(a[i]+" ");
}
}
}