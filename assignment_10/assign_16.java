class Counter16 {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class Worker16 extends Thread {
    Counter16 c;

    Worker16(Counter16 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) c.increment();
    }
}

class as_10_q_16 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant - 241551078");
        Counter16 c = new Counter16();
        Worker16 t1 = new Worker16(c), t2 = new Worker16(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.count);
    }
}
