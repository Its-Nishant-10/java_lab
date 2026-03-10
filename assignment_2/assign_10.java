/*
 * Write a Java program to find the longest increasing subsequence (LIS) (basic
 * LIS logic allowed)
 */

import java.util.Scanner;

public class assign_10 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int last = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > last) {
                count++;
                last = arr[i];
            }
        }
        System.out.println("LIS length: " + count);
        sc.close();
    }
}