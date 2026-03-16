class Demo11 extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

class as_10_q_11 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Demo11 t = new Demo11();
        t.run();
        t.start();
    }
}
