import java.io.FileOutputStream;
import java.util.Scanner;

class as_9_q_6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.println("What to append");
        String d = sc.nextLine();
        FileOutputStream fos = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_5.txt", true);
        fos.write(d.getBytes());
        fos.close();
        sc.close();
    }
}
