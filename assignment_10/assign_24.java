class Account24 {
    int balance = 0;

    synchronized void withdraw(int amt) throws Exception {
        while (balance < amt) wait();
        balance -= amt;
        System.out.println("Withdraw done");
    }

    synchronized void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited " + amt);
        notify();
    }
}

class as_10_q_24 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Account24 a = new Account24();
        new Thread(() -> {
            try {
                a.withdraw(500);
            } catch (Exception e) {
            }
        }).start();
        new Thread(() -> {
            a.deposit(1000);
        }).start();
    }
}
