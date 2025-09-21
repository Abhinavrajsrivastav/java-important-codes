package MuliThreading;

import java.util.concurrent.*;

public class ByLamdaFunction {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Thread: "+Thread.currentThread().getName());
        });

        t1.start();
    }
}
