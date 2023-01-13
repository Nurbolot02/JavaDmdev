package org.example.lesson26Cuncurrent.lock;

public class AccountThread extends Thread {
    private Account account1;
    private Account account2;

    public AccountThread(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    public Account getAccount1() {
        return account1;
    }

    public void setAccount1(Account account1) {
        this.account1 = account1;
    }

    public Account getAccount2() {
        return account2;
    }

    public void setAccount2(Account account2) {
        this.account2 = account2;
    }

    @Override
    public void run() {
        try{
            lockAccounts();
            for (int i = 0; i < 2000; i++) {
                account1.addMoney(10);
                account2.addMoney(-10);
            }
        }
        finally {
            account1.getLock().unlock();
            account2.getLock().unlock();
        }
    }

    private void lockAccounts() {
        while (true){
            boolean ac1 = account1.getLock().tryLock();
            boolean ac2 = account2.getLock().tryLock();
            if (ac1 & ac2){
                break;
            }
            if (ac1){
                account1.getLock().unlock();
            }
            if (ac2){
                account2.getLock().unlock();
            }
        }
    }
}
