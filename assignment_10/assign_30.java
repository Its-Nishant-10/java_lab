class Downloader extends Thread {
    int part;

    Downloader(int p) {
        part = p;
    }

    public void run() {
        System.out.println("Downloading part " + part);
    }
}

class as_10_q_30 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        for (int i = 1; i <= 5; i++) new Downloader(i).start();
    }
}
