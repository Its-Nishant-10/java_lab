import java.io.FileInputStream;
import java.io.FileOutputStream;

class as_9_q_30 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream in = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_29.txt");
        FileOutputStream out = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_30.txt");
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch - 1);
        }
        in.close();
        out.close();
        System.out.println("Decrypted successfully");
    }
}
