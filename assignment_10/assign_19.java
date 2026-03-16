class Demo19 {
    static synchronized void show() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread19 extends Thread {
    public void run() {
        Demo19.show();
    }
}

class as_10_q_19 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new MyThread19().start();
        new MyThread19().start();
    }
}
