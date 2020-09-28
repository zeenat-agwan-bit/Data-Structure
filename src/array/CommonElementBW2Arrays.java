import java.util.*;

public class CommonElementBW2Arrays{

public static void main (String args[]){
int arr1[]={1,2,3,4,5,4};//duplicacy(go for HashSet)
int arr2[]={1,5,7,8,4,5};//duplicacy

HashSet<Integer>hs1=new HashSet<>();
HashSet<Integer>hs2=new HashSet<>();

for(int num: arr1){

hs1.add(num);
}
for(int num: arr2){

hs2.add(num);

}
for(int num : hs2){
boolean b=hs1.add(num);
if(b==false){
System.out.println(num);
}
}





/*
int arr1[]={1,2,3,4,5,4};//duplicacy(go for HashSet)
int arr2[]={1,6,7,8,4,5};

HashSet<Integer>hs=new HashSet<>();

for(int num: arr1){

hs.add(num);
}
for(int num: arr2){

boolean b=hs.add(num);
if(b==false){
System.out.println(num);
}
}
*/










/*
for(int i=0;i<arr1.length;i++){

for(int j=0;j<arr2.length;j++){

if(arr1[i]==arr2[j]){

hs.add(arr1[i]);
break;                             //makes it efficient 

//System.out.println("Duplicate Elements are : "+arr1[i]+" ");

}


}
}

for(int num: hs){
System.out.println(num+" ");
}
*/
}
}