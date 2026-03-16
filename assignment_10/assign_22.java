class Resource22 {
}

class as_10_q_22 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Resource22 r1 = new Resource22(), r2 = new Resource22();
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                synchronized (r2) {
                    System.out.println("Thread1 done");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (r1) {
                synchronized (r2) {
                    System.out.println("Thread2 done");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
