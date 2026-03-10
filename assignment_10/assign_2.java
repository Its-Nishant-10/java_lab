class EvenR implements Runnable {

   public void run() {
      for (int i = 0; i <= 10; i += 2) {
         System.out.println("Even Runnable: " + i);
      }
   }
}

class OddT extends Thread {

   public void run() {
      for (int i = 1; i <= 10; i += 2) {
         System.out.println("Odd Thread: " + i);
      }
   }
}

class as_10_q_2 {

   public static void main(String[] args) {
      Thread t1 = new Thread(new EvenR());
      OddT t2 = new OddT();
      t1.start();
      t2.start();
   }
}
