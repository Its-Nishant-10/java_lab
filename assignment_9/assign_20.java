import java.io.FileInputStream;
import java.io.FileOutputStream;

class as_9_q_20 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileOutputStream out = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_20.txt");
        out.write("My Name is Nishant Nahar".getBytes());
        out.close();
        System.out.println("Data to be written in file");
        FileInputStream in = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_20.txt");
        int ch;
        System.out.println("Data read from the file");
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }
        in.close();
    }
}
