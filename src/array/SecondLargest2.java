public class SecondLargest2{

public static void main(String args[]){
int a[]={3,5,7,8,4,9,11};

int largest=Integer.MIN_VALUE;//-2147483648
int sec_largest=Integer.MIN_VALUE;
for(int i=0;i<a.length;i++){

if(a[i]>largest){
//as it is
sec_largest=largest;
largest=a[i];
}
else if(a[i]>sec_largest && a[i]!=largest)
{ 
//smaller than largest but greater than sec_largest
sec_largest=a[i];
}

}

if(sec_largest==Integer.MIN_VALUE)
{

System.out.println("there is no second largest");
}
else
{
System.out.println("second largest is " +sec_largest);
}

}
}

