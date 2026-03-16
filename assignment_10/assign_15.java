class Counter15 {
    int count = 0;

    void increment() {
        count++;
    }
}

class Worker15 extends Thread {
    Counter15 c;

    Worker15(Counter15 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) c.increment();
    }
}

class as_10_q_15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant - 241551078");
        Counter15 c = new Counter15();
        Worker15 t1 = new Worker15(c), t2 = new Worker15(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.count);
    }
}
