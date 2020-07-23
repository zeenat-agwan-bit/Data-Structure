package stack;

public class DynamicStack {
int capacity=2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data) {
        if(size()==capacity)//full
    expand();
        stack[top] = data;
        top++;
    
    }
    public void expand(){
        int length=size();
        int newStack[]=new int [capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);//copy the ele from stack to new statck
        stack=newStack;
        capacity*=2;
    }

   
       public int pop() {
        int data = 0;
         if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
shrink();  //if the number of elements are goes below 1/4 we will make it half
         }     
         return data;
    }
             
public void shrink(){
    int length =size();
    if(length<=(capacity/2)/2); 
    capacity=capacity/2;
    int newStack[]=new int[capacity];
      System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
}

    public int peek() {
        int data;
        data = stack[top - 1];
        stack[top] = 0;
        return data;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
