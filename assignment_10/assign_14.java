class NameThread14 extends Thread {
    public void run() {
        System.out.println("Thread: " + getName());
    }
}

class as_10_q_14 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        NameThread14 t = new NameThread14();
        t.setName("WorkerThread");
        t.start();
    }
}
