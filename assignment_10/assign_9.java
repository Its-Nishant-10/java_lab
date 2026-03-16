class Priority9 extends Thread {
    public void run() {
        System.out.println(getName() + " priority " + getPriority());
    }
}

class as_10_q_9 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Priority9 t1 = new Priority9(), t2 = new Priority9(), t3 = new Priority9();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
