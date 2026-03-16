class Worker7 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) System.out.println("Working...");
    }
}

class as_10_q_7 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Worker7 w = new Worker7();
        System.out.println("Initial: " + w.getState());
        w.start();
        while (w.isAlive()) {
            System.out.println("State: " + w.getState());
        }
        System.out.println("Final: " + w.getState());
    }
}
