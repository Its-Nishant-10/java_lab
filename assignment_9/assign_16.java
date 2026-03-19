import java.io.FileInputStream;

class as_9_q_16 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream f = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_7.txt");
        int ch;
        int lines = 0, words = 0;
        boolean i = false;
        while ((ch = f.read()) != -1) {
            if (ch == '\n')
                lines++;
            if (ch == ' ' || ch == '\n' || ch == '\t') {
                i = false;
            } else if (!i) {
                words++;
                i = true;
            }
        }
        f.close();
        System.out.println("Lines : " + lines);
        System.out.println("Words : " + words);
    }
}
