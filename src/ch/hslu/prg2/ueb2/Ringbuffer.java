package ch.hslu.prg2.ueb2;

public class Ringbuffer {
    private int head;
    private int tail;
    private int size;
    private int amountElements;
    
    private Object[] queue;
    
    public Ringbuffer(int size) {
        this.size = size;
        queue = new Object[size];
    }
    
    public void enqueue(Object x) {
        if(isFull()){
            System.out.println("queue is full");
            return;
        } 
        
        amountElements ++;
        queue[tail] = x;
        tail++;
        tail = tail%size;
    }
    public Object dequeue() {
        amountElements --;
        
        Object firstItem = queue[head];   
        head++;
        return firstItem;        
    }
    public boolean isEmpty() {
        return amountElements == 0;
    }
    public boolean isFull() {
        int tempTail = tail +1;
        tempTail = tempTail%size;
        
        return tempTail == head;
    }
}
