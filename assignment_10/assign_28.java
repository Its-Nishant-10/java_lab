class CheckInterrupt extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Thread interrupted");
                return;
            }
            System.out.println(i);
        }
    }
}

class as_10_q_28 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        CheckInterrupt t = new CheckInterrupt();
        t.start();
        t.interrupt();
    }
}
