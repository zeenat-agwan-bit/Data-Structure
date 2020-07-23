package linkedlistt;

public class MyLinkedList {

    Node head;

    void add(int data) {
        Node toAdd = new Node(data);
        //check list empty or not
        if(isEmpty()){
            head=toAdd;
            return;
        }
        //traversing last
        Node temp = head; //start from head if linked list is already empty than head points to null 
        while (temp.next != null) {  //so temp is already null here  we will get nullpointerexception
            temp = temp.next; //till do this operation
        }
        //now last node becomes temp
        //now we add new Node at tail
        temp.next = toAdd; //now its next contains null
    }
    //to print
    void print(){
        //iterate
         Node temp = head; //start from head if linked list is already empty than head points to null 
        while (temp != null) { 
            System.out.println(temp.data+" ");
            temp = temp.next; 
    }
    }
boolean isEmpty(){
    //in one line
    //return head==null;
    if(head==null){
        return true;
    }
    else{
        return false;
    }
}
//reverse
//next_node----curr_node----previous_node
 Node reverse(Node head) {
if(head==null)return head;
Node previous=null;
Node current_node=head;
while(current_node!=null){
   Node next_node=current_node.next;
    current_node.next=previous;
    previous=current_node;
    current_node=next_node;
}
return previous;

    }
//compare
boolean compareLists(Node head1, Node head2) {

if(head1==null && head2==null)return true;
Node first=head1;
Node second=head2;
while(first!=null && second!=null){
    if(first.data !=second.data){
        break;
    }
    if(first.next==null && second.next==null){
    return true;
}
first=first.next;
second=second.next;
}

return false;
    }
//remove duplicates
//1 2 3 3 3 4 5 it may be a case
     Node removeDuplicates(Node head) {
if(head==null)
return head;
Node new_head=head;
while(head.next!=null){
    if(head.data==head.next.data){
head.next=head.next.next;
    }
    else{
    head=head.next;
}
}
return new_head;

    }

//merge
 Node mergeLists(Node head1, Node head2) {

if(head1==null) return head2;
if(head2==null) return head1;

Node head3=null;
if(head1.data<head2.data){
    head3=head1;
    head1=head1.next;
}
else{
    head3=head2;
    head2=head2.next;
}
Node curr_node= head3;
while(head1!=null && head2!=null){
    if(head1.data<head2.data){
    curr_node.next=head1;
    head1=head1.next;
}
else{
    curr_node.next=head2;
    head2=head2.next;
}
curr_node.next=curr_node;
}
if(head1==null){
    curr_node.next=head2;
  
}
else{
    curr_node.next=head1;
   
}

return head3;
}
//get node value
 int getNode(Node head, int positionFromTail) {
Node pointer_node=head;


int counter=0;

while(head!=null){

    head=head.next;

    if(counter<positionFromTail){
        counter++;
    }

    else{
        pointer_node=pointer_node.next;
    }
    
}
return  pointer_node.data;

    }

//merge point of 2 lists 
 //head1=1->2->3->7->8 len=5
 //head2=5->6->7->8 len=4
 int findMergeNode(Node head1,Node head2){
     Node head1_curr=head1;
     Node head2_curr=head2;
     while(head1_curr!=head2_curr){
         if(head1_curr.next==null){
              head1_curr=head2;
         }else{
             head1_curr=head1_curr.next;
         }
          if(head2_curr.next==null){
             head2_curr=head1;
         }else{
             head2_curr=head2_curr.next;
         }
     }
     return head1_curr.data;
 }
 
 
    //node class
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
