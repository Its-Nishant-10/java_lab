class Child13 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) System.out.println("Child " + i);
    }
}

class as_10_q_13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant - 241551078");
        Child13 t = new Child13();
        t.start();
        t.join();
        System.out.println("Main finished");
    }
}
