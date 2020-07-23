package LinkAndStack;

import java.util.NoSuchElementException;

public class MyDoubly {

    Node head;
    Node tail;

    //INSERT
    void insert(int data) { 
        /* allocate node */
      Node newNode = new Node();
        newNode.next = null;
        newNode.data = data;
        newNode.previous = null;
        /* since we are adding at the beginning,  
         prev is always NULL */
        newNode.previous = null; 
  
        /* link the old list off the new node */
      newNode.next = head; 
  
        /* change prev of head node to new node */
        if (head != null) { 
            head.previous = newNode; 
        } 
  
        /* move the head to point to the new node */
        head = newNode; 
    } 
  
    
    //INSERT AT BEGINING
    public void insertAtStart(int data) {
        Node newNode = new Node();
        newNode.next = null;
        newNode.data = data;
        newNode.previous = null;
        if (head == null && tail == null) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    //INSERT AT END
    public void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.next = null;
        newNode.data = data;
        newNode.previous = null;
        if (head == null && tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    //DELETE FIRST NODE
    public Node deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;//we assign null to break links
        }
        head = head.next;//2nd node becomes null
        temp.next = null; //broke 
        return temp;
    }
    
      //DELETE LAST NODE
    public Node deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp =tail;
        if (head == tail) {
            tail = null;
        } else {
           tail.previous.next = null;//we assign null to break links
        }
        tail = tail.previous;
        temp.previous = null; //broke 
        return temp;
    }
    
    
    //IS EMPTY?

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    //PRINT FORWARD
    public void displayForward() {
        if (head == null) {
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("null");
    }

    //PRINT BACKWARDS
    public void displaybacward() {
        if (tail == null) {
            return;
        }
        Node node = tail;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.previous;
        }
        System.out.print("null");
    }
    
    //REVERSE
    void reverse() { 
        Node temp = null; 
        Node current = head; 
  
        /* swap next and prev for all nodes of  
         doubly linked list */
        while (current != null) { 
            temp = current.previous; 
            current.previous = current.next; 
            current.next = temp; 
            current = current.previous; 
        } 
  
        /* Before changing head, check for the cases like empty  
         list and list with only one node */
        if (temp != null) { 
            head = temp.previous; 
        } 
    } 
    
}
