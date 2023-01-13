package org.example.lesson26Cuncurrent.semaphore;

import java.util.concurrent.Semaphore;

public class CountThread implements Runnable {
    private CommonResource res;
    private Semaphore sem;
    private String name;

    public CountThread(CommonResource commonResource, Semaphore semaphore, String name) {
        this.res = commonResource;
        this.sem = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s wainting permit\n", name);
        try{
            sem.acquire();
            System.out.printf("%s get permit\n", name);
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println(name + " освобождает разрешение");
        sem.release();
    }
}
