import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class as_9_q_19 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            FileInputStream f = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_1.txt");
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
