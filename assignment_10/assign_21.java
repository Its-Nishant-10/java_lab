class A21 {
}

class B21 {
}

class as_10_q_21 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        A21 a = new A21();
        B21 b = new B21();
        Thread t1 = new Thread(() -> {
            synchronized (a) {
                synchronized (b) {
                    System.out.println("Thread1");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (b) {
                synchronized (a) {
                    System.out.println("Thread2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
