import java.util.InputMismatchException;
import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            System.out.println(x);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
