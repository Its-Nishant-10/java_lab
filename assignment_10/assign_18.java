class Bank18 {
    int balance = 1000;

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn " + amt);
        } else System.out.println("Insufficient");
    }
}

class Customer18 extends Thread {
    Bank18 b;

    Customer18(Bank18 b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(700);
    }
}

class as_10_q_18 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Bank18 b = new Bank18();
        new Customer18(b).start();
        new Customer18(b).start();
    }
}
