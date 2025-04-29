package Day7_Multithreading_Continued.ProducerConsumerProblem;

public class Producer extends Thread{
    private final Buffer buffer;
    public Producer(Buffer buffer){
        this.buffer= buffer;
    }
    public void run(){
        int value= 0;
        try{
            while(true){
                buffer.produce(value++);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Producer is being interrupted");
        }
    }
}
