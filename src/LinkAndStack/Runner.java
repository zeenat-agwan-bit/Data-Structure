package LinkAndStack;
public class Runner {
    public static void main(String[] args) {
        MySingly link=new MySingly();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.insert(4);
          link.insert(5);
        link.show();
        System.out.println("result:");
          link.printNthFromLast(2);
          System.out.println("Count of 1 is " + link.countOccurance(1)); 
      link.searchMiddle();
    //  link.swap(4, 65);
         link.show();
      //link.swapPairWise();
      link.moveFront();
      
    //  link.removeDuplicates();//sorted list
    link.removeDuplicateUnSorted();
          link.show();
          
      //  System.out.println( link.GetNth(0));
        //link.head.next.next.next.next=link.head;
       //  if (link.detectLoop(head)) {
      //      System.out.println("Loop found"); }
   //      else{
     //       System.out.println("No Loop"); 
     
      //  link.palindrome();
     /*   
        link.insertAtStart(10);
   //     link.insertAt(2, 55);
          link.insertAt(0, 55);
          link.removeAt(1);
          link.show();
          System.out.println("___________");
       link.reversePrint();
       link.insertAt(1, 80);
        System.out.println( link.length());
        if(link.search(55)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    */
   
    }
}
