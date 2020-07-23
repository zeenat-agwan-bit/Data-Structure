package deque;

import java.util.ArrayDeque;
//21 public function
//faster than stack class bcz stack extends vector and sync overhead fun to aquire lock
public class Runner {
    public static void main(String[] args) {
        ArrayDeque<Integer>ad=new ArrayDeque<>();
        ad.push(12);
        ad.push(13);
        ad.push(14);
             ad.push(16);
        ad.pop();
        System.out.println( ad.peek());
    }
    
}
