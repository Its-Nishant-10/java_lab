import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class as_9_q_24 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        FileOutputStream out = new FileOutputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_24.txt");
        System.out.print("Enter number: ");
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            out.write((n + " ").getBytes());
        }
        out.close();
        FileInputStream in = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_24.txt");
        Scanner s2 = new Scanner(in);
        int sum = 0, count = 0;
        while (s2.hasNextInt()) {
            sum += s2.nextInt();
            count++;
        }
        s2.close();
        in.close();
        sc.close();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / (double) count));
    }
}
