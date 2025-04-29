package Day7_Multithreading_Continued.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureMain {
    public static void main(String[] args) {
        CompletableFuture<String> future= CompletableFuture.supplyAsync(()->{
            return "Hello from a thread";
        });

        future.thenAccept(result->{
            System.out.println("Result: "+result);
        });

        System.out.println("Main thread continues");

        // supplyAsync ---> runs a task in the background and return a result.
        // thenAccept ----> consumes the result when it's ready.

        // Chaining
        // 1. thenApply(Function) transforms result
        CompletableFuture<Integer> future1= CompletableFuture.supplyAsync(() -> 50)
                .thenApply(x -> x * 2);  // returns another future with the result 100
        // 2. thenAccept(Consumer) consumes result (returns void)
        future1.thenAccept(result -> System.out.println("Result: " + result));

        // 3. thenRun(Runnable) runs a task after previous is done, doesn’t use result
        future1.thenRun(() -> System.out.println("All done!"));


        // Combining Multiple Futures
        // 1. thenCompose ---> flattening nested futures
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Shantanu ")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "Gupta"));

        future2.thenAccept(System.out::println);  // Output: Hello World

        // 2. thenCombine ---> combine 2 futures;
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> combined = f1.thenCombine(f2, (a,b)->a+b);
        combined.thenAccept(System.out::println);  // Output: 30


        // Exception Handling

        // exceptionally --> catch and handles errors.
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> {
            if (true) throw new RuntimeException("Oops!");
            return "No Error";
        }).exceptionally(ex -> {
            System.out.println("Caught exception: " + ex);
            return "Default value";
        });
        f3.thenAccept(System.out::println);


        // allOf() and anyOf()
        /*
            CompletableFuture<Void> all = CompletableFuture.allOf(future1, future2);
            CompletableFuture<Object> any = CompletableFuture.anyOf(future1, future2);

         */

        // Custom Thread Pools

        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletableFuture<Void> fut = CompletableFuture.runAsync(() -> {
         System.out.println("Running in custom pool");
        }, executor);

        executor.shutdown();




    }
}
