import java.io.FileInputStream;
import java.io.IOException;

class as_9_q_9 {
    public static void main(String[] args) throws IOException {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream reads = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_5.txt");
        int ch;
        while ((ch = reads.read()) != -1) {
            System.out.print((char) ch);
        }
        reads.close();
    }
}
