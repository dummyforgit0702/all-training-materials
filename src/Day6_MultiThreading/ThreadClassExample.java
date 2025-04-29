package Day6_MultiThreading;

public class ThreadClassExample extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){

            System.out.println(Thread.currentThread().getName()+" i= "+i);
        }
    }
}
