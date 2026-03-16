class Counter17 {
    int count = 0;

    void increment() {
        synchronized (this) {
            count++;
        }
    }
}

class Worker17 extends Thread {
    Counter17 c;

    Worker17(Counter17 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) c.increment();
    }
}

class as_10_q_17 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant - 241551078");
        Counter17 c = new Counter17();
        Worker17 t1 = new Worker17(c), t2 = new Worker17(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
