package Day6_MultiThreading;
class MyThread extends Thread{
    public void run(){
        System.out.println(getName()+" started");
        try{
            Thread.sleep(1000);
            System.out.println(getName()+" is running after sleep");
        }
        catch(InterruptedException e){
            System.out.println(getName()+" was interrupted.");
        }
        System.out.println(getName()+" finished");
    }
}
public class ThreadMethodsMain {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        MyThread t2= new MyThread();

        System.out.println("Thread t1 is alive ? "+ t1.isAlive());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        System.out.println("Thread t1 started with priority: " + t1.getPriority());
        System.out.println("Thread t2 started with priority: " + t2.getPriority());

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted. ");

        }
        System.out.println("Thread t1 is alive? "+t1.isAlive());
        System.out.println("Main method finished.");
    }
}
