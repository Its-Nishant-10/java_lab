class StateThread6 extends Thread {
    public void run() {
        System.out.println("Thread started");
    }
}

class as_10_q_6 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        StateThread6 t = new StateThread6();
        System.out.println("Before start: " + t.getState());
        t.start();
        System.out.println("After start: " + t.getState());
    }
}
