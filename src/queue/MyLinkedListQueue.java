package queue;
/*
rear(tail) ---push------enqueue
head (front)-pop------dequeue
*/
public class MyLinkedListQueue {
    public Node head,rear;
     public void enqueue(int data){
              Node node=new Node();
               node.data = data;
              node.next = null;
         if(head==null){     //empty
             head=rear=node;
             return;
         }
        rear.next=node;
         rear=rear.next; //and next becomes rear
     }
     
     public int dequeue(){  //return element from head
         if(head==null){
    return 0;
         }
       Node temp=head;
       head=head.next;
       if(head==null){ //case if head null then rear also be null
           rear=null;
       }
       return temp.data;
     }
     
       public int peek() {
           if(head==null){
               return 0;
           }else{
           return head.data;
       }
       }
}
