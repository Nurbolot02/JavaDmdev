package org.example.lesson26Cuncurrent.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(0, "bill1");
        Account account2 = new Account(20000, "bill1");

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        executorService.submit(new AccountThread(account1, account2));
        executorService.submit(new AccountThread(account2, account1));
        executorService.submit(new AccountThread(account2, account1));
        executorService.submit(new AccountThread(account2, account1));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

        System.out.println(account1.getMoney());
        System.out.println(account2.getMoney());

    }
}
