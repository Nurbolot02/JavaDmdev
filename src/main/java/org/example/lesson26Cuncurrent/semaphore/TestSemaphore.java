package org.example.lesson26Cuncurrent.semaphore;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public class TestSemaphore {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Semaphore semaphore = new Semaphore(1);
//        CommonResource commonResource = new CommonResource(0);
//        new Thread(new CountThread(commonResource, semaphore, "CountThread 1")).start();
//        new Thread(new CountThread(commonResource, semaphore, "CountThread 2")).start();
//        new Thread(new CountThread(commonResource, semaphore, "CountThread 3")).start();

        AtomicLong atomicLong = new AtomicLong();

        Callable<AtomicLong> task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(atomicLong.incrementAndGet());
                Thread.sleep(10);
            }
            return atomicLong;
        };

        FutureTask<AtomicLong> listFutureTask = new FutureTask<>(task);
        new Thread(listFutureTask).start();
        System.out.println("waiting result from future");
        while (!listFutureTask.isDone()){
            System.out.println("waiting result from future");
        }
        System.out.println(listFutureTask.get());
    }
}
