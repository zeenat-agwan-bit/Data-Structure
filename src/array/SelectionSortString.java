public class SelectionSortString{
public static void main(String args[]){
String[] a={"zee","hey","yuyu","azys","mash","bug"};
int min;
String temp="";
for(int i=0;i<a.length;i++){
min =i; //here we secure the value of i
for(int j=i+1;j<a.length;j++){
if(a[j].compareTo(a[min])<0){
min=j;
} 
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
for(int i=0;i<a.length;i++){
System.out.println(a[i]+" ");
}

}
}