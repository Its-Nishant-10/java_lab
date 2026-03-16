class Demo8 extends Thread {
    public void run() {
        System.out.println("Thread executing");
    }
}

class as_10_q_8 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Demo8 t = new Demo8();
        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
    }
}
