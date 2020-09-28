public class MergeEleOfTwoArrays{
public static void main(String[]args){
int arr1[]={1,2,3,4,5};
int arr2[]={6,7,8,9};
int a1_len=arr1.length;
int a2_len=arr2.length;
int res_length=a1_len+a2_len;
int res_array[]=new int [res_length];
for(int i=0;i<arr1.length;i++){
res_array[i]=arr1[i];
}
for(int i=0;i<arr2.length;i++){
res_array[arr1.length+i]=arr2[i];
}
for(int i=0;i<res_array.length;i++){
System.out.print(res_array[i]+" ");
}



}

}