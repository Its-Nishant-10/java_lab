//Write a Java program to find the second-largest element in an integer array without sorting.

import java.util.Scanner;

public class assign_1 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int large = arr[0];
        int seclarge = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                seclarge = large;
                large = arr[i];
            } else if (arr[i] > seclarge && arr[i] != large) {
                seclarge = arr[i];
            }
        }

        System.out.println("The Second Largest Number is " + seclarge);
        scan.close();
    }
}
