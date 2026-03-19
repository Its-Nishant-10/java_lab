import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class as_9_q_17 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("replace word ");
        String oldW = sc.nextLine();
        System.out.print("new word");
        String newW = sc.nextLine();
        FileInputStream f = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_12.txt");
        int ch;
        String content = "";
        while ((ch = f.read()) != -1) {
            content += (char) ch;
        }
        f.close();
        content = content.replace(oldW, newW);
        FileOutputStream out = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_17.txt");
        out.write(content.getBytes());
        out.close();
        sc.close();
    }
}
