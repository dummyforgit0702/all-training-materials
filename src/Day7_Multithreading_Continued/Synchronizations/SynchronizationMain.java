package Day7_Multithreading_Continued.Synchronizations;

public class SynchronizationMain {
    public static void main(String[] args) {
        Brackets bracket= new Brackets();
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    bracket.printBrackets('{', '}');
                }
            }
        });

        // thread1.start();

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    bracket.printBrackets('[', ']');
                }
            }
        });
        thread1.start();
        thread2.start();
        /*
        Without the synchronization, the result would be inconsistent;
         */
    }
}
