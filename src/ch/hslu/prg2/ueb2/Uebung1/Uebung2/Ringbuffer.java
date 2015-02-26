package ch.hslu.prg2.ueb2.Uebung1.Uebung2;

public class Ringbuffer {
    private Object[] queue;
    private int head;
    private int tail;
    private int size;
    
    public Ringbuffer(int size) {
        this.size = size;
        queue = new Object[size];
    }
    
    public void enqueue(Object x) {
        if(isFull()){
            System.out.println("queue is full");
            return;
        }        
        queue[tail] = x;
        tail++;
        tail = tail%size;
    }
    public Object dequeue() {
        Object firstItem = queue[head];   
        head++;
        return firstItem;        
    }
    public boolean isEmpty() {
        return head == tail;
    }
    public boolean isFull() {
        int tempTail = tail +1;
        tempTail = tempTail%size;
        
        return tempTail == head;
    }
}
