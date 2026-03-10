/* Write a Java program that accepts student marks using command line arguments and prints grade distribution (A/B/C/F) */

public class assign_40 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        int A = 0, B = 0, C = 0, F = 0;

        for (int i = 0; i < args.length; i++) {
            int m = Integer.parseInt(args[i]);

            if (m >= 80) {
                A++;
            } else if (m >= 60) {
                B++;
            } else if (m >= 40) {
                C++;
            } else {
                F++;
            }
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("F: " + F);
    }
}
