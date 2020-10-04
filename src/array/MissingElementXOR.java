package array;

public class MissingElementXOR{
public static void main(String args[]){

//give arr xor
//with missing element xor
//grouping associative/commutative
int arr[]={1,2,4,5,6,7};
int xor1=arr[0];
for(int i=1;i<arr.length;i++)
{
xor1=xor1^ arr[i];
}
int xor2=0;
//expected elements xor (including missing num)
for(int i=1;i<=(arr.length+1);i++)
{
xor2=xor2 ^ i;
}
System.out.println("Missing Element Is :"+ (xor1^xor2));
}
}