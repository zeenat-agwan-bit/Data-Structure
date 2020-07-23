package deque;

public class Node {
    int data;
    Node previous;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=this.previous=null;
    }
  
}
