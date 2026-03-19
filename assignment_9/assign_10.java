import java.io.FileInputStream;

class as_9_q_10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream fis = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_7.txt");
        int count = 0;
        while (fis.read() != -1) {
            count++;
        }
        fis.close();
        System.out.println("Total characters in file: " + count);
    }
}
