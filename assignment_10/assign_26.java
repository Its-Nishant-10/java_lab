class DaemonDemo extends Thread {
    public void run() {
        while (true) System.out.println("Daemon running");
    }
}

class as_10_q_26 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        DaemonDemo t = new DaemonDemo();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread ends");
    }
}
