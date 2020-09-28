public class MergeSort {

int [] array;
int [] tempMergeArr;
int length;
public static void main(String args[]){
int[] inputArr={48,36,13,52,19,94,21};
MergeSort ms=new MergeSort();
ms.sort(inputArr);
for(int i: inputArr){
System.out.println(i+" ");
}

}

public void sort(int inputArr[])
{
this.array=inputArr;
this.length=inputArr.length;
this.tempMergeArr=new int[length];
divideArray(0,length-1); //0 to 6
}

public void divideArray(int lowerIndex,int higherIndex){
if(lowerIndex < higherIndex){
int middle=lowerIndex+(higherIndex-lowerIndex)/2;

divideArray(lowerIndex ,middle);//sort left side 
divideArray(middle+1,higherIndex);//sort right side
mergeArray(lowerIndex,middle,higherIndex);
}
}

public void mergeArray(int lowerIndex,int middle,int higherIndex){
for(int i=lowerIndex;i<=higherIndex;i++){
tempMergeArr[i]=array[i];
}
int i=lowerIndex;
int j=middle+1;
int k=lowerIndex; //.....................

while(i<=middle  &&  j<=higherIndex){

if(tempMergeArr[i]<=tempMergeArr[j]){
array[k]=tempMergeArr[i]; //lower index
i++;
}
else{
array[k]=tempMergeArr[j];
j++;
}
k++;

}
while(i<=middle){   //i is lowerIndex
array[k]=tempMergeArr[i];
k++;
i++;
}
}


}