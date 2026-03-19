import java.io.FileOutputStream;
import java.io.IOException;

class as_9_q_7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Nishant Nahar - 241551078");
        FileOutputStream fos = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_7.txt");
        String text = "Hello\nMy\nName\nis\nNishant\nNahar";
        fos.write(text.getBytes());
        fos.close();
    }
}
