public class FirstDuplicateElement1{
//poor performance
public static void main(String[]args){
int a[]={1,5,6,3,2,5,1,2,4};
int temp=0;
for(int i=0;i<a.length-1;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]==a[j] && (i!=j)){
System.out.print(" First Duplicate Element Is : " +a[i]);
temp=temp+1;
break;
}
}
if(temp>0){
break;
}
}

}
}