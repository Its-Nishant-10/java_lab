import java.io.BufferedInputStream;
import java.io.FileInputStream;

class as_9_q_28 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        long start1 = System.currentTimeMillis();
        FileInputStream f1 = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_28.txt");
        while (f1.read() != -1) {
        }
        f1.close();
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        BufferedInputStream f2 = new BufferedInputStream(
                new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_28.txt"));
        while (f2.read() != -1) {
        }
        f2.close();
        long end2 = System.currentTimeMillis();
        System.out.println("Without Buffer Time: " + (end1 - start1) + " ms");
        System.out.println("With Buffer Time: " + (end2 - start2) + " ms");
    }
}
