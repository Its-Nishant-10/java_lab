import java.io.FileInputStream;
import java.io.FileOutputStream;

class as_9_q_13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream f1 = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_12.txt");
        FileInputStream f2 = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_13_1.txt");
        FileOutputStream f3 = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_13.txt");
        int ch;
        while ((ch = f1.read()) != -1) {
            f3.write(ch);
        }
        while ((ch = f2.read()) != -1) {
            f3.write(ch);
        }
        f1.close();
        f2.close();
        f3.close();
    }
}
