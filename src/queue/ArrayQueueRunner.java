package queue;
public class ArrayQueueRunner {
    public static void main(String[] args) {
        MyArrayQueue mq=new MyArrayQueue();
        mq.enQueue(5);
        mq.enQueue(2);
          mq.enQueue(4);
      mq.enQueue(7);
//          mq.show();
     mq.deQueue();
//        mq.show();
//       mq.deQueue();
//     mq.enQueue(4);
//        mq.enQueue(7);
System.out.println(mq.isEmpty());
System.out.println(mq.isFull());
        System.out.println("size is:"+mq.getSize());
        mq.show();
    }
}
