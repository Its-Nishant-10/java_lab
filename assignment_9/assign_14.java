import java.io.FileInputStream;

class as_9_q_14 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream f1 = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_12.txt");
        FileInputStream f2 = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_12_1.txt");
        int ch1, ch2;
        boolean same = true;
        while (true) {
            ch1 = f1.read();
            ch2 = f2.read();
            if (ch1 != ch2) {
                same = false;
                break;
            }
            if (ch1 == -1) break;
        }
        f1.close();
        f2.close();
        if (same)
            System.out.println("Identical");
        else
            System.out.println("Different");
    }
}
