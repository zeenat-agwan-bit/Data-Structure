package LinkAndStack;

public class StackUsingLL {

    private MySingly my = new MySingly();

    //stack extends vector implements LinkedList
    //stack is basicaaly abstract class to implement itself it uses vector 
    //PUSH
    public void push(int e) {
        my.insert(e);
    }
//POP

    public int pop() throws Exception {
        if (my.isEmpty()) {
            throw new Exception("Popping from empty stack is not allowed...");
        }
        return my.removeLast();

    }
//PEEK

    public int peek() throws Exception {
        //
        if (my.isEmpty()) {
            throw new Exception("Peepingg from empty stack is not allowed...");
        }
        return my.getLast();
    }
}
