package stack;

public class RunnerStack {

    public static void main(String[] args) {
        MyStack my = new MyStack();
        my.push(10);
        my.push(20);

        my.push(30);//last in
        System.out.println("return top :" + my.peek());
        //      System.out.println("Popped element:"+my.pop());//first out
        System.out.println("Size is :" + my.size());
        System.out.println("is empty ? :" + my.isEmpty());
        my.show();
        DynamicStack ds = new DynamicStack();
        System.out.println("______________________________________");
        ds.push(1);
        ds.push(4);
        ds.push(2);
        ds.push(9);
        ds.push(3);
        ds.push(89);
        ds.push(4);
        ds.push(67);
         ds.push(31);
        ds.push(55);
ds.show();
ds.pop();
ds.show();
ds.pop();
ds.show();ds.pop();
ds.show();ds.pop();
ds.show();
    }
}
