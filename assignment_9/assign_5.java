import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class as_9_q_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name - ");
        String grd = sc.nextLine();
        FileOutputStream grdd = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_5.txt");
        grdd.write(grd.getBytes());
        grdd.close();
        sc.close();
    }
}
