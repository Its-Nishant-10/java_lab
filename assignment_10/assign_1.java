class EvenThread extends Thread {
   public void run() {
      for (int i = 0; i <= 10; i += 2) System.out.println("Even: " + i);
   }
}
class OddThread implements Runnable {
   public void run() {
      for (int i = 1; i <= 10; i += 2) System.out.println("Odd: " + i);
   }
}
class as_10_q_1 {
   public static void main(String[] args) {
      System.out.println("");
      Thread t1 = new EvenThread();
      Thread t2 = new Thread(new OddThread());
      t1.start();
      t2.start();
   }
}