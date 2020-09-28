import java.util.*;

public class CommonElementBW3Arrays{
//FOR SORTED ARRAY
public static void main (String args[]){

ArrayList <Integer>al=new ArrayList <>();

int arr1[]={2,3,4,5};
int arr2[]={2,3,4};
int arr3[]={2,3};
int x=0;
int y=0;
int z=0;
while(x<arr1.length && y<arr2.length && z<arr3.length){

if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
{
al.add(arr1[x]);
x++;
y++;
z++;
}

else if(arr1[x] <arr2[y])
{
x++;
}
else if(arr2[y] <arr3[z]){
y++;
}
else{
z++;
}


}

for(int num : al){
System.out.println(num);
}


}
}