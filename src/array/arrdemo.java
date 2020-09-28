 public class arrdemo{
public static void main(String args[]){
int a[][]={{12,13,14,15},{10,20,30}};


System.out.println(a[0].length);

for(int i=0;i<a.length;i++){

for(int j=0;j<a[i].length;j++){

System.out.print(a[i][j]+" ");

}

System.out.println(" ");
}


}
}