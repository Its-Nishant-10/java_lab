import java.io.FileInputStream;
import java.io.FileOutputStream;

class as_9_q_29 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream in = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_29.txt");
        String data = "";
        int ch;
        while ((ch = in.read()) != -1) {
            data += (char) (ch + 1);
        }
        in.close();
        FileOutputStream out = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_29.txt", true);
        out.write(("\n" + data).getBytes());
        out.close();
        System.out.println("Encrypted data appended");
    }
}
