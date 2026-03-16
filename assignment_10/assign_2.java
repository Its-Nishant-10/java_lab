class MyThread2 extends Thread {
    public void run() {
        System.out.println("Thread class running");
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

class as_10_q_2 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new MyThread2().start();
        new Thread(new MyRunnable2()).start();
    }
}
