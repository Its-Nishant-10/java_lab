class Buffer23 {
    int data;
    boolean available = false;

    synchronized void produce(int val) throws Exception {
        while (available) wait();
        data = val;
        available = true;
        System.out.println("Produced " + val);
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) wait();
        System.out.println("Consumed " + data);
        available = false;
        notify();
    }
}

class as_10_q_23 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Buffer23 b = new Buffer23();
        new Thread(() -> {
            try {
                b.produce(10);
            } catch (Exception e) {
            }
        }).start();
        new Thread(() -> {
            try {
                b.consume();
            } catch (Exception e) {
            }
        }).start();
    }
}
