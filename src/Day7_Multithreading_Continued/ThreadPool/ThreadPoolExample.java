package Day7_Multithreading_Continued.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=1; i<=6; i++){
            MyTask task= new MyTask(i);
            executor.submit(task);
        }
        executor.shutdown();
    }
}
