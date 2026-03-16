class NumThread12 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
        }
    }
}

class as_10_q_12 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new NumThread12().start();
        new NumThread12().start();
    }
}
