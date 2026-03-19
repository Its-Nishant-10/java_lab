import java.io.FileInputStream;

class as_9_q_8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream n = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_7.txt");
        int ch = n.read();
        if (ch != -1)
            System.out.println("First character is: " + (char) ch);
        else
            System.out.println("File is empty!");
        n.close();
    }
}
