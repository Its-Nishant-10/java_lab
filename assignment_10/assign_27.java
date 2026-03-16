class SleepThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread going to sleep");
            Thread.sleep(5000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class as_10_q_27 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        SleepThread t = new SleepThread();
        t.start();
        t.interrupt();
    }
}
