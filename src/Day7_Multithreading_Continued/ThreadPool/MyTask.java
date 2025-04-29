package Day7_Multithreading_Continued.ThreadPool;

public class MyTask implements Runnable{
    private final int taskId;
    public MyTask(int id){
        this.taskId= id;
    }

    @Override
    public void run() {
        System.out.println("Task "+ taskId+" started by "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Task "+ taskId+" finished by "+ Thread.currentThread().getName());
    }
}
