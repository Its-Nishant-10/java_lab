import java.io.File;

class as_9_q_26 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        File f = new File("D:\\4th_sem\\java_lab\\assignment_9\\assign_26.txt");
        if (f.exists()) {
            if (f.delete())
                System.out.println("File deleted successfully");
            else
                System.out.println("File cannot be deleted");
        } else {
            System.out.println("File does not exist");
        }
    }
}
