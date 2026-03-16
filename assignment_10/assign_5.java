class Task5 extends Thread {
    public void run() {
        System.out.println("Running " + getName());
    }
}

class as_10_q_5 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        int n = 5;
        for (int i = 0; i < n; i++) new Task5().start();
    }
}
