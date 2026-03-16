class NotifyDemo25 {
    synchronized void wakeAll() {
        notifyAll();
        System.out.println("All threads notified");
    }
}

class as_10_q_25 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new NotifyDemo25().wakeAll();
    }
}
