import java.io.File;
import java.util.Scanner;

class as_9_q_25 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword: ");
        String key = sc.nextLine();

        Scanner file = new Scanner(new File(
                "D:\\4th_sem\\java_lab\\assignment_9\\assign_7.txt"));

        boolean found = false;
        while (file.hasNextLine()) {
            String line = file.nextLine();

            if (line.contains(key)) {
                System.out.println("Found");
                System.out.println(line);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

        file.close();
        sc.close();
    }
}
