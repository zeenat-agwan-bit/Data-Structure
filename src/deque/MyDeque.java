package deque;
//doubly ended queue using linkes list
public class MyDeque {
  Node head,tail;
  //ADD
public void addToHead(int data){
    Node node=new Node(data);
    if(head==null){
    head=tail=node;
    return;
}  
head.next=node;
node.previous=head;
head=node;
        }
//REMOVE
public int removeLast(){
    if(head==null){
        return 0;
    }
    Node node=tail;
    tail=tail.next;
    tail.previous=null;
    if(tail==null){
        head=null;//then head should also be null
    }
    return node.data;
}
}
