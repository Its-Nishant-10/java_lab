class Task10 extends Thread {
    int delay;

    Task10(int d) {
        delay = d;
    }

    public void run() {
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
        }
        System.out.println("Task " + getName() + " executed");
    }
}

class as_10_q_10 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new Task10(1000).start();
        new Task10(2000).start();
        new Task10(3000).start();
    }
}
