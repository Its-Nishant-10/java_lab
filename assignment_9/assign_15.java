import java.io.FileInputStream;
import java.io.FileOutputStream;

class as_9_q_15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream f1 = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_12.txt");
        FileOutputStream f2 = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_15.txt");
        int ch;
        while ((ch = f1.read()) != -1) {
            f2.write(Character.toUpperCase((char) ch));
        }
        f1.close();
        f2.close();
    }
}
