package MuliThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample {

    public static void main(String[] args) {
        // Create a custom ThreadFactory

        //annonymous class
        //to customise the thread...
        ThreadFactory factory = new ThreadFactory() {
            //count = id
            private int count = 1;

            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setName("CustomThread-" + count++);
                t.setDaemon(false); 
                System.out.println("Creating thread: " + t.getName());
                return t;
            }
        };

        // Create an ExecutorService using the custom ThreadFactory
        ExecutorService executor = Executors.newFixedThreadPool(3, factory);

        // Submit tasks
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            //submiting the task
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing task " + taskId);
            });
        }

        executor.shutdown();
    }
}
