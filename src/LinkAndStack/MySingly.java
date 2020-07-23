package LinkAndStack;

import java.util.HashSet;
import java.util.Stack;

public class MySingly {

    Node head; //first node defined (by default null)
    //INSERT AT END

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;//node itself is head
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;//shifting to check till getting null
            }
            n.next = node;
        }
    }

    //INSERT AT START
    public void insertAtStart(int data) {
        Node node = new Node(); //new
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;//now first node becomes head
    }

    //INSERT AT LOCATION
    public void insertAt(int index, int data) {
        Node node = new Node(); //new
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertAtStart(data);
        } else {
            //traverse to the index 
            Node n = head;
            for (int i = 0; i < index - 1; i++) { //suppose we have to insert at position 2 then we have to reach at index 1 first
                n = n.next;
            }
            // the address with new node
            node.next = n.next;       //n     node      .....
            //now change
            n.next = node;
        }
    }

    //GET LAST
   public int getLast() throws Exception{
       Node temp=head;
          //if list is already empty throws exception
          if(temp==null){
              throw new Exception("cant peek last from empty linked list");
          }
        //traverse till 2nd last element and make it null automatic last will be removed
        while(temp.next!=null){
   temp=temp.next;         
        }
      return temp.data;   //data of last element
    }
   
    
    //REMOVE FROM LOCATION
    public void removeAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            //traverse to the index 
            Node n = head;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) { //suppose we have to insert at position 2 then we have to reach at index 1 first
                n = n.next;
            }
            //we just need to change the address
            temp = n.next; //we will put the address of the deleted node in the temp node
            n.next = temp.next;
            //  System.out.println("temp :"+ temp.data);
            temp = null;//so this is eligible for garbage colletion
        }

    }

    //REMOVE FROM LAST
    //2nd last element next null
    public int removeLast() throws Exception{
      
        Node temp=head;
          //if list is already empty throws exception
          if(temp==null){
              throw new Exception("cant remove last from empty stack");
          }
        //if only one element in our list
        if(temp.next==null){
            Node toRemove=head; //save
            head=null;
            return toRemove.data;
        }
        //traverse till 2nd last element and make it null automatic last will be removed
        while(temp.next.next!=null){
   temp=temp.next;         
        }
        Node toRemove=temp.next;//save
        temp.next=null;
        return toRemove.data;
    }
    
    //REVERSE PRINT
    public void reversePrint() {
        if (head == null) {

        }
        Stack stack = new Stack();
        Node node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            Node n = (Node) stack.pop();
            System.out.println(n.data);

        }

    }

    //LENGTH
    public int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //SEARCH
    public boolean search(int x) {
        Node node = head;
        while (node != null) {
            if (node.data == x) {
                return true;
            }
        }
        return false;
    }

    // CHECK PALINDROME
    public boolean palindrome() {

        boolean ispalin = true;
        Stack stack = new Stack();
        Node node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            Node n = (Node) stack.pop();
            if (head.data == n.data) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

    //DETECT CYCLE
    public boolean detectLoop(Node h) {

        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node 
            // in hashmap it means their is a cycle 
            // (Because you we encountering the 
            // node second time). 
            if (s.contains(h)) {
                return true;
            }

            // If we are seeing the node for 
            // the first time, insert it in hash 
            s.add(h);

            h = h.next;
        }

        return false;
    }

    //GET NTH NODE
    public int GetNth(int index) {
        Node node = head;
        int count = 0;
        while (node != null) {
            if (count == index) {
                return node.data;
            }
            count++;
            node = node.next; //now next
        }

        /* if we get to this line, the caller was asking 
        for a non-existent element so we assert fail */
        assert (false);
        return 0;
    }

    //GET NTH NODE FROM THE END
    void printNthFromLast(int n) {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List 
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of 
        // the linked list 
        if (len < n) {
            return;
        }

        temp = head;

        // 2) get the (len-n+1)th node from the beginning 
        for (int i = 1; i < len - n + 1; i++) {
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    //PRINT MIDDLE
    public void searchMiddle() {
        //both are pointing head
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is : " + slow_ptr.data);
        }
    }

    //NUMBER OF TIMES OCCUREING
    //1->2->1->2->1->3->1 and given key is 1, then output should be 4.
    public int countOccurance(int value_search) {
        Node node = head;
        int count = 0;
        while (node != null) {
            if (node.data == value_search) {
                count++;
            }
            node = node.next;
        }
        return count;

    }

    //REMOVE DUPLICATES FROM SORTED LL
    public void removeDuplicates() {
        /*Another reference to head*/
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and  
            keep on deleting them until it matches the current  
            node data */
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different  
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }

    //REMOVE DUPLICATES FROM UNSORTED LL
    public void removeDuplicateUnSorted() {
        HashSet<Integer> hs = new HashSet<>();
        Node curr = head;
        Node pre = null;
        while (curr != null) {
            int curval = curr.data;
            // If current value is seen before 
            if (hs.contains(curval)) {
                pre.next = curr.next;
            } else {
                hs.add(curval);
                pre = curr;
            }
            curr = curr.next;
        }
    }

    //SWAP NODES WITHOUT SWAPPING DATA
    /*  it has following cases to be handled.
1) x and y may or may not be adjacent.
2) Either x or y may be a head node.
3) Either x or y may be last node.
4) x and/or y may not be present in linked list.*/
    public void swap(int x, int y) {
        // Nothing to do if x and y are same 
        if (x == y) {
            return;
        }
        // Search for x (keep track of prevX and CurrX) 
        Node preX = null;
        Node currX = head;

        while (currX != null && currX.data != x) {
            preX = currX;
            currX = currX.next;
        }
        // Search for x (keep track of prevX and CurrX) 
        Node preY = null;
        Node currY = head;

        while (currY != null && currY.data != y) {
            preY = currY;
            currY = currY.next;
        }
        // If either x or y is not present, nothing to do 
        if (currX == null || currY == null) {
            return;
        }
        // If x is not head of linked list 
        if (preX != null) {
            preX.next = currY;
        } else //make y the new head 
        {
            head = currY;
        }

        // If y is not head of linked list 
        if (preY != null) {
            preY.next = currX;
        } else // make x the new head 
        {
            head = currX;
        }
        // Swap next pointers 
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    //PAIRWISE SWAP
    public void swapPairWise() {
        Node temp = head;
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {
            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    //MOVE TO FIRST
    public void moveFront() {
        Node secLast = null;
        Node last = head;
        while (last.next != null) {
            secLast = last;
            last = last.next;
        }

        /* Set the next of second last as null */
        secLast.next = null;

        /* Set the next of last as head */
        last.next = head;

        /* Change head to point to last node. */
        head = last;
    }

    //PRINT
    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;//shifting to check null till the end
        }
        System.out.println(node.data);
    }

    void reversePrint(MySingly link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //IS EMPTY
    public boolean  isEmpty(){
        return head==null;
    }
}
