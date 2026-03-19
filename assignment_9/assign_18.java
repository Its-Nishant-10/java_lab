import java.io.File;
import java.util.Scanner;

class as_9_q_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nishant Nahar - 241551078");
        System.out.print("File");
        String name = sc.nextLine();
        File f = new File("D:\\4th_sem\\java_lab\\assignment_9\\" + name);
        if (f.exists())
            System.out.println("File is present");
        else
            System.out.println("File is not present");
        if (f.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can't be read");
        if (f.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can't be written");
        sc.close();
    }
}
