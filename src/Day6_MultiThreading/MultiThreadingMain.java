package Day6_MultiThreading;

public class MultiThreadingMain {
    public static void main(String[] args) {
        ThreadClassExample t1= new ThreadClassExample();
        t1.start();

        RunnableInterfaceExample temp= new RunnableInterfaceExample();
        Thread t2= new Thread(temp);
        t2.start();
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" i= "+i);
        }
    }
}
