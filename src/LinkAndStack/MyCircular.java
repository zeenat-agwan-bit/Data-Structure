package LinkAndStack;

import java.util.NoSuchElementException;

public class MyCircular {

    private Node last;
    private int length;

    class Node {

        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public MyCircular() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        Node first = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;

    }

    public void display() {
        if (last == null) {
            return;
        }
        Node first = last.next;
        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }
//INSERT AT BEGININNG
    public void insertAtBegining(int data){
        Node temp=new Node(data);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    //INSERT AT END
    public void insertAtEnd(int data){
        Node temp=new Node(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
           temp.next=   last.next;
           last.next=temp;
           last=temp;
        }
        length++;
    }
    
    //REMOVE FIRST NODE
      public Node deleteFirst(){
          if(isEmpty()){
              throw new NoSuchElementException("already empty");
              }
          Node temp=last.next;
          if(last.next==last){
              last=null;
          }
          else{
              last.next=temp.next;
          }
          temp.next=null;
          length--;
          return temp;
      }
      //Convert SINGLY LL to  CIRCULAR
      public Node circular(Node head) 
{ 
    // declare a node variable  
    // start and assign head  
    // node into start node. 
    Node start = head; 
  
    // check that while head.next 
    // not equal to null then head  
    // points to next node. 
    while (head.next != null) 
        head = head.next; 
          
    // if head.next points to null  
    // then start assign to the  
    // head.next node. 
    head.next = start; 
    return start; 
} 
    public static void main(String[] args) {
        Node head=null;
        MyCircular mc = new MyCircular();
        mc.createCircularLinkedList();
        mc.insertAtBegining(20);
        mc.insertAtEnd(30);
        mc.circular(head);
      
      //  mc.deleteFirst();
        mc.display();
    }
}
