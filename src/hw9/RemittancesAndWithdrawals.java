package hw9;

public class RemittancesAndWithdrawals {
    public static void main(String[] args) {
        Account account = new Account();//只有1個，讓執行緒去爭奪資源
        RemittancesThread remittancesThread = new RemittancesThread(account);
        WithdrawalsThread withdrawalsThread = new WithdrawalsThread(account);

        remittancesThread.start();
        withdrawalsThread.start();

        try {
            remittancesThread.join();
            withdrawalsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("結束");
    }
}

class Account {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        while (balance > 3000) {
            System.out.println("媽媽看到餘額超過3000元，停止匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        System.out.println("媽媽匯款 " + amount + " 元，帳戶餘額為 " + balance + " 元");
        notify(); // 唤醒可能在等待提款的熊大
    }

    public synchronized void withdraw(int amount) {
        while (balance < 2000) {
            System.out.println("熊大看到餘額小於2000元，要求匯款");
            try {
                wait(); // 等待媽媽匯款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("熊大提款 " + amount + " 元，帳戶餘額為 " + balance + " 元");
        while (balance < 1000) {
            System.out.println("帳戶餘額不足，等待媽媽匯款");
            notify();
        }
    }
}

class RemittancesThread extends Thread {
    private Account account;

    public RemittancesThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(2000);
            try {
                Thread.sleep(1000); // 等待一段時間再匯款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WithdrawalsThread extends Thread {
    private Account account;

    public WithdrawalsThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw(1000);
            try {
                Thread.sleep(1000); // 等待一段時間再提款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
