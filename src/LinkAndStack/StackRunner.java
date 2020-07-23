package LinkAndStack;

public class StackRunner {

    public static void main(String[] args) throws Exception {
        StackUsingLL stack = new StackUsingLL();
        stack.push(12);
        stack.push(24);
        stack.push(36);

        int popped = stack.pop();
        System.out.println("element removed:" + popped);
        int peeked = stack.peek();
        System.out.println("Peeked:" + peeked);

    }

}
