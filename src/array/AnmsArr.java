public class AnmsArr
{ 
     public static void main (String args[])
{
        AnmsArr.sum(new int[][]{{10,20,30},{40,50}});
}

static void  sum(int arr[][]){
int total=0;
for(int i[]:arr)
{
for(int ii:i){
total=total+ii;
}
}
System.out.println("Sum is :"+total);
}

}