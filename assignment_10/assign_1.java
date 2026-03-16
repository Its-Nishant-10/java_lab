class EvenThread extends Thread {
    int limit;

    EvenThread(int l) {
        limit = l;
    }

    public void run() {
        for (int i = 2; i <= limit; i += 2) System.out.print(i + " ");
    }
}

class OddThread extends Thread {
    int limit;

    OddThread(int l) {
        limit = l;
    }

    public void run() {
        for (int i = 1; i <= limit; i += 2) System.out.print(i + " ");
    }
}

class as_10_q_1 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        int n = 10;
        new EvenThread(n).start();
        new OddThread(n).start();
    }
}
