package Day7_Multithreading_Continued.ProducerConsumerProblem;

public class Consumer extends Thread{
    private final Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer= buffer;
    }
    public void run(){
        try{
            while(true){
                buffer.consume();
                Thread.sleep(1500);

            }
        }catch(InterruptedException e){
            System.out.println("Consumer is being interrupted");
        }
    }
}
