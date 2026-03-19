import java.io.FileInputStream;

class as_9_q_11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileInputStream f = new FileInputStream("D:\\4th_sem\\java_lab\\assignment_9\\assign_7.txt");
        int ch;
        int v = 0, c = 0, d = 0, s = 0;
        while ((ch = f.read()) != -1) {
            char x = (char) ch;
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                v++;
            } else if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
                c++;
            } else if (x >= '0' && x <= '9') {
                d++;
            } else {
                s++;
            }
        }
        f.close();
        System.out.println("Vowels : " + v);
        System.out.println("Cons  : " + c);
        System.out.println("Digits : " + d);
        System.out.println("Special : " + s);
    }
}
