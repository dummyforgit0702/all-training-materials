package Day6_MultiThreading;

public class RunnableInterfaceExample implements Runnable{
    public void run(){
        for(int i=5; i<=10; i++){
            System.out.println(Thread.currentThread().getName()+" i="+i);
        }
    }
}
