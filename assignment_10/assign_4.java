class InfoThread4 extends Thread {
    public void run() {
        System.out.println("Name: " + getName() + " | ID: " + getId() + " | Priority: " + getPriority());
    }
}

class as_10_q_4 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        for (int i = 0; i < 5; i++) new InfoThread4().start();
    }
}
