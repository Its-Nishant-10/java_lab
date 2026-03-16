class T1 extends Thread {
    public void run() {
        try {
            System.out.println("T1");
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

class T2 extends Thread {
    public void run() {
        try {
            System.out.println("T2");
            Thread.sleep(1500);
        } catch (Exception e) {
        }
    }
}

class as_10_q_3 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new T1().start();
        new T2().start();
    }
}
