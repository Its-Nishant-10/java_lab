import java.io.FileInputStream;

class as_9_q_22 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream f = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_22.txt");
        int ch;
        while ((ch = f.read()) != -1) {
            System.out.println("Byte: " + ch + "  Character: " + (char) ch);
        }
        f.close();
    }
}
