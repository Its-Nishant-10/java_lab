import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class as_9_q_23 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        int ch;
        String path = "D:\\4th_sem\\java_lab\\assignment_9\\assign_23.txt";

        do {
            System.out.println("\n1.Write  2.Append  3.Read  4.Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter text: ");
                    String s1 = sc.nextLine();
                    FileOutputStream f1 = new FileOutputStream(path);
                    f1.write((s1 + "\n").getBytes());
                    f1.close();
                    break;

                case 2:
                    System.out.print("Enter text: ");
                    String s2 = sc.nextLine();
                    FileOutputStream f2 = new FileOutputStream(path, true);
                    f2.write((s2 + "\n").getBytes());
                    f2.close();
                    break;

                case 3:
                    FileInputStream f3 = new FileInputStream(path);
                    int c;
                    while ((c = f3.read()) != -1)
                        System.out.print((char) c);
                    f3.close();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 4);
        sc.close();
    }
}
