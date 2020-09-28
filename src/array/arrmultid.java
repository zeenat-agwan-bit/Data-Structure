 public class arrmultid{
public static void main(String args[]){
int a[][][]={{ {12,13,14,15},{10,20,30} ,{90,80}} };
System.out.println(a[0].length);//3
System.out.println(a[0][0].length);//4
System.out.println(a[0][1].length);//3
System.out.println(a[0][2].length);//2
System.out.println(a[0][0][0]);//12
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
for(int k=0;k<a[i][j].length;k++){
System.out.print(a[i][j][k]+" ");
}
System.out.println(" ");
}
}
}
}