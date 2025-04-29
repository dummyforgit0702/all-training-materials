package Day7_Multithreading_Continued.ProducerConsumerProblem;

import java.util.LinkedList;

public class Buffer {
    private final int capacity= 5;
    private final LinkedList<Integer>list= new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException{
        while(list.size()==capacity){
            System.out.println("Buffer is full, producer is waiting");
            wait();
        }
        list.add(value);
        System.out.println("Produced: "+value);
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        while(list.isEmpty()){
            System.out.println("Buffer is empty, consumer is waiting");
            wait();
        }
        int value= list.removeFirst();
        System.out.println("Consumed: "+value);
    }
}
