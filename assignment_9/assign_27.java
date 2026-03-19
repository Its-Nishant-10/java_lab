import java.io.PrintWriter;
import java.util.Date;

class as_9_q_27 {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("D:\\4th_sem\\java_lab\\assignment_9\\assign_27.txt");
        Date d = new Date();
        pw.println("Current Date and Time:");
        pw.println(d);
        pw.close();
        System.out.println("Date and Time written successfully");
    }
}
