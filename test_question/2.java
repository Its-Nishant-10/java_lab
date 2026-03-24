class Transaction{
    int balance = 5000;

    synchronized void withdraw(int amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("Withdrawan " + amt);
            System.out.println("New Balance " + balance);
        }
        else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void cancel(){
        notify();
    }
}

class user extends Thread{
    Transaction t;
    int n;

    user(Transaction t, int n){
        this.t = t;
        this.n = n;
    }

    public void run(){
        t.withdraw(n);
    }
}

class MM{
    public static void main(String[] args){
        Transaction t = new Transaction();
        user u1 = new user(t, 1000);
        user u2 = new user(t, 2000);
        user u3 = new user(t, 3000);
        u1.start();
        u2.start();
        u3.start();
    }
}
